package com.ovnny.primeira_rest_api_dio.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

// DB Configuration Profiles

@Configuration
@ConfigurationProperties("spring.datasource")
@SuppressWarnings("unused")
public class DBConfiguration {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev")
    @Bean
    // Connecting locally with Spring H2
    public String devDatabaseConnection() {
        System.out.println("DB connection for DEV - H2");
        System.out.println("driverClassName");
        System.out.println("url");
        return "DB connection in DEV - H2";
    }

    @Profile("test")
    @Bean
    // Connecting Remotely with PostgreSQL
    public String testDatabaseConnection() {
        System.out.println("DB connection to RDS_TEST - Low Cost Instance");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to RDS_TEST - Low Cost Instance";
    }

    @Profile("prod")
    @Bean
    // Production database connection
    public String prodDatabaseConnection() {
        System.out.println("DB connection to RDS_PROD - High Performance Instance");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to RDS_TEST - High Performance Instance";
    }


}
