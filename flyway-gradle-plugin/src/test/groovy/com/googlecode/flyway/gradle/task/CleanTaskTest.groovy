package com.googlecode.flyway.gradle.task

import org.junit.Test
import com.googlecode.flyway.gradle.FlywayPluginTestBase

public class CleanTaskTest extends FlywayPluginTestBase {

    @Test
    public void shouldCleanTheDatabase() {

        def sql = dbConnector()

        project.tasks.flywayInit.execute();

        def tablesResultSet = dbConnector().connection.metaData.getTables(null, "PUBLIC", "SCHEMA_VERSION", null)
        assert tablesResultSet.next()

        project.tasks.flywayClean.execute();

        tablesResultSet = sql.connection.metaData.getTables(null, "PUBLIC", "schema_version", null)
        assert !tablesResultSet.next()
    }
}
