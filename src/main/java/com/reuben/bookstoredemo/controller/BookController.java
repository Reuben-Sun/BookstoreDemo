package com.reuben.bookstoredemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class BookController {
    @Autowired
    JdbcTemplate jdbcTemplate;

    @GetMapping("/bookList")
    public List<Map<String, Object>> bookList(){
        //String sql0 = "create table book('id int,name varchar,money float')";

        String sql1 = "select * from books";
        List<Map<String, Object>> list_maps = jdbcTemplate.queryForList(sql1);
        return list_maps;
    }
}
