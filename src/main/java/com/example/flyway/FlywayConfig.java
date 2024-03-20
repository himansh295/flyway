//package com.example.flyway;
//
//import org.flywaydb.core.Flyway;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
//import org.springframework.boot.autoconfigure.flyway.FlywayConfigurationCustomizer;
//import org.springframework.boot.autoconfigure.flyway.FlywayProperties;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration(proxyBeanMethods=false)
//@ConditionalOnClass(org.springframework.jdbc.support.JdbcUtils.class)
//@ConditionalOnMissingBean(org.flywaydb.core.Flyway.class)
//@EnableConfigurationProperties(FlywayProperties.class)
//public class FlywayConfig {
//
//    @Bean
//    public FlywayConfigurationCustomizer flywayConfigurationCustomizer() {
//        return configuration -> {
//            configuration.locations("classpath:db/migration");
//            configuration.baselineOnMigrate(true);
//        };
//    }
//
//    @Bean
//    public Flyway flyway() {
//        return Flyway.configure()
//                .baselineOnMigrate(true)
//                .dataSource("jdbc:mysql://localhost:3306/blogging","root","Himanshu2905*")
//                .locations("classpath:db/migration")
//                .load();
//    }
//}
