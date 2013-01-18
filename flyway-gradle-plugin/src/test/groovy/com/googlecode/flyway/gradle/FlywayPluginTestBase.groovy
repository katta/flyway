package com.googlecode.flyway.gradle

import groovy.sql.Sql
import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.After
import org.junit.Before

public class FlywayPluginTestBase {

    protected Project project;

    @Before
    public void setupBase() {
        project = ProjectBuilder.builder().build()
        project.apply plugin: 'flyway'

        project.flyway {
            driver='org.h2.Driver'
            url='jdbc:h2:flyway-test'
            user='sa'
            password=''
        }
    }

    @After
    public void teardown() {
        project.tasks.flywayClean.execute()
    }

    protected Sql dbConnector() {
        Sql.newInstance(project.flyway.url, project.flyway.user, project.flyway.password, project.flyway.driver)
    }
}
