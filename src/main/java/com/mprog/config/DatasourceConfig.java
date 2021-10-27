package com.mprog.config;

import com.zaxxer.hikari.HikariDataSource;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ConfigurationProperties("spring.datasource")
@Getter
@Setter
public class DatasourceConfig {

    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Bean
    public HikariDataSource dataSource() {
        return DataSourceBuilder
                .create()
                .driverClassName(getDriverClassName())
                .url(getUrl())
                .username(getUsername())
                .password(getPassword())
                .type(HikariDataSource.class)
                .build();
    }

    @Bean
    public JdbcTemplate jdbcTemplate(HikariDataSource hikariDataSource){
        return new JdbcTemplate(hikariDataSource);
    }
}