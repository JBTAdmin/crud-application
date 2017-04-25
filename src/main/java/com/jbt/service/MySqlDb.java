package com.jbt.service;

import com.jbt.dao.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class MySqlDb {

    @Autowired
    public PersonDao personDao;

    @Autowired
    public JdbcTemplate jdbcTemplate;


    public void method(){

        personDao.count();
        jdbcTemplate.queryForList("select * from person");
    }
}
