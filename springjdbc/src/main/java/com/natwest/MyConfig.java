package com.natwest;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class MyConfig {


    @Bean
    public DataSource dataSourceBean(){
        DriverManagerDataSource driverManagerDataSource= new DriverManagerDataSource();
        driverManagerDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/movies");
        driverManagerDataSource.setUsername("root");
        driverManagerDataSource.setPassword("$Vaish@1234");
        return driverManagerDataSource;
    }
    @Bean
    public JdbcTemplate jdbcTemplateBean(){
        JdbcTemplate jdbcTemplate= new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSourceBean());
        return jdbcTemplate;
    }
    @Bean
    public EmployeeCrud getEmployeeInstance() {

        EmployeeCrud employeeCrud = new EmployeeCrud();
        employeeCrud.setJdbcTemplate(jdbcTemplateBean());
        return employeeCrud;
    }


}
