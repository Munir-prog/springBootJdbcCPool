package com.mprog;

import com.mprog.config.DatasourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(DatasourceConfig.class)
public class SpringBootJdbcCPoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJdbcCPoolApplication.class, args);
    }

}
