package org.apache.airavata.registry.core.utils.migration;

import java.util.Collections;
import java.util.Map;

import org.apache.airavata.common.utils.JDBCConfig;
import org.apache.openjpa.jdbc.conf.JDBCConfiguration;
import org.apache.openjpa.jdbc.conf.JDBCConfigurationImpl;
import org.apache.openjpa.jdbc.meta.MappingTool;
import org.apache.openjpa.lib.util.Options;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MappingToolRunner {

    private static Logger logger = LoggerFactory.getLogger(MappingToolRunner.class);

    public static void run(JDBCConfig jdbcConfig, String outputFile, String persistenceUnitName) {
        run(jdbcConfig, outputFile, persistenceUnitName, MappingTool.ACTION_ADD);
    }

    public static void run(JDBCConfig jdbcConfig, String outputFile, String persistenceUnitName, String schemaAction) {

        JDBCConfiguration jdbcConfiguration = new JDBCConfigurationImpl();
        jdbcConfiguration.fromProperties(createConnectionProperties(jdbcConfig));
        jdbcConfiguration.setConnectionDriverName("org.apache.commons.dbcp.BasicDataSource");

        Options options = new Options();
        options.put("sqlFile", outputFile);
        // schemaAction "add" brings the schema up to date by adding missing schema elements
        // schemaAction "createDB" creates the entire schema as if the database is empty
        options.put("schemaAction", schemaAction);
        options.put("foreignKeys", "true");
        options.put("indexes", "true");
        options.put("primaryKeys", "true");
        // Specify persistence-unit name using it's anchor in the persistence.xml file
        // http://openjpa.apache.org/builds/2.4.3/apache-openjpa/docs/ref_guide_conf_devtools.html
        options.put("properties", "persistence.xml#" + persistenceUnitName);
        try {
            MappingTool.run(jdbcConfiguration, new String[] {}, options, null);
        } catch (Exception mappingToolEx) {
            logger.error("Failed to run MappingTool", mappingToolEx);
            throw new RuntimeException(
                    "Failed to run MappingTool to generate migration script", mappingToolEx);
        }
    }

    // TODO: copied from JPAUtils
    private static Map<String, String> createConnectionProperties(JDBCConfig jdbcConfig) {
        String connectionProperties = "DriverClassName=" + jdbcConfig.getDriver() + "," + "Url=" + jdbcConfig.getURL()
                + "?autoReconnect=true," + "Username=" + jdbcConfig.getUser() + "," + "Password="
                + jdbcConfig.getPassword() + ",validationQuery=" + jdbcConfig.getValidationQuery();
        logger.debug("Connection properties={}", connectionProperties);
        return Collections.singletonMap("openjpa.ConnectionProperties", connectionProperties);
    }
}
