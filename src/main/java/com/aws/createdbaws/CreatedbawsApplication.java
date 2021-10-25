package com.aws.createdbaws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

@SpringBootApplication
public class CreatedbawsApplication {

    public static void main(String[] args) throws SQLException {

        SpringApplication.run(CreatedbawsApplication.class, args);

        Connection c = DriverManager.getConnection("jdbc:postgresql://database-1.cmeqgqyduags.us-west-2.rds.amazonaws.com:5432/", "postgres22", "nepr12345");
        Statement statement = c.createStatement();
        statement.executeUpdate("CREATE DATABASE sales");
    }

}