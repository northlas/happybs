package com.example.happybs.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            BookConfig bookConfig,
            CategoryConfig categoryConfig,
            DetailConfig detailConfig
    ) {
        categoryConfig.categorySeeder();
        detailConfig.detailSeeder();
        bookConfig.bookSeeder();
        return null;
    }
}
