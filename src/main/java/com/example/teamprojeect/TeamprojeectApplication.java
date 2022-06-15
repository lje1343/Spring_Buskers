package com.example.teamprojeect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TeamprojeectApplication {

    public static void main(String[] args) {
        SpringApplication.run(TeamprojeectApplication.class, args);
    }

}
