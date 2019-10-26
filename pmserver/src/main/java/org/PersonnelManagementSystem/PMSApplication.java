package org.PersonnelManagementSystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("org.PersonnelManagementSystem.mapper")
@EnableCaching
public class PMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(PMSApplication.class, args);
    }

}
