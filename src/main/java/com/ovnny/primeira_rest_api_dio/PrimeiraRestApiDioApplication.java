package com.ovnny.primeira_rest_api_dio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class PrimeiraRestApiDioApplication {

    public static void main(String[] args) {

        SpringApplication.run(PrimeiraRestApiDioApplication.class, args);
    }

}
