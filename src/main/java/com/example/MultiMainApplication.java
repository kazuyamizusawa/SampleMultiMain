package com.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(
        basePackages = {
                "com.example"
        }
)
public class MultiMainApplication extends SpringBootServletInitializer {
    private static Logger log = LogManager.getLogger();

    public static void main(String[] args) {
        SpringApplication.run(MultiMainApplication.class, args);
        log.info("######one");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MultiMainApplication.class);
    }
}
