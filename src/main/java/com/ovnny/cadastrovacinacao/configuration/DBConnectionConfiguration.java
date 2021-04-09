package com.ovnny.cadastrovacinacao.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

// DB Configuration Profiles

@Configuration
@EnableConfigurationProperties(DBConfiguration.class)
public class DBConnectionConfiguration {

    private final DBConfiguration dbConfiguration;

    public DBConnectionConfiguration(DBConfiguration dbConfiguration) {
        this.dbConfiguration = dbConfiguration;
    }

    @Profile("dev")
    @Bean
    public String devDBConnection() {
        System.out.println("DB connection for DEV");
        System.out.println(dbConfiguration.getUrl());
        System.out.println(dbConfiguration.getUserName());
        System.out.println(dbConfiguration.getPassword());
        System.out.println(dbConfiguration.getDriverClassName());
        return "DB connection in DEV - H2";
    }

    @Profile("test")
    @Bean
    public String testDBConnection() {
        System.out.println("DB connection for TEST");
        System.out.println(dbConfiguration.getUrl());
        System.out.println(dbConfiguration.getUserName());
        System.out.println(dbConfiguration.getPassword());
        System.out.println(dbConfiguration.getDriverClassName());
        return "DB Connection IN TEST - Low Cost Instance";
    }

    @Profile("prod")
    @Bean
    public String prodDBConnection() {
        System.out.println("DB connection to PROD - High Performance Instance");
        System.out.println(dbConfiguration.getUrl());
        System.out.println(dbConfiguration.getUserName());
        System.out.println(dbConfiguration.getPassword());
        System.out.println(dbConfiguration.getDriverClassName());
        return "DB Connection to RDS_TEST - High Performance Instance";
    }
}
