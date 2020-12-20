package com.zisal.cloud.zipkin.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ZipkinClientApplication {

    public static void main(String [] args) {
        SpringApplication.run(ZipkinClientApplication.class);
    }
    
    @Bean
    AlwaysSampler alwaysSampler() {
        return new AlwaysSampler();
    }
}
