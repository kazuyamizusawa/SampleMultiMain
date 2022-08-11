package com.example2;

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
                "com.example2"
        }
)
public class MultiMainApplication2 extends SpringBootServletInitializer {
    private static Logger log2 = LogManager.getLogger();

    public static void main(String[] args) {
        SpringApplication.run(MultiMainApplication2.class, args);
        log2.info("######two");
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(MultiMainApplication2.class);
    }
}
