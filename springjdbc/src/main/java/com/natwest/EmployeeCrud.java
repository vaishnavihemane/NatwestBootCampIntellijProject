package com.natwest;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeCrud {


    JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    void createTable(){
        jdbcTemplate.execute("create table emp20(id int, name varchar(30),dept varchar(30))");

        System.out.println("Table created");

    }




    void InsertData(){
        jdbcTemplate.execute( "Insert into emp20 values(1, 'Vaishnavi', 'Natwest Digital X')" );
    }

    
}
