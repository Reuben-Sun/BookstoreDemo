package com.reuben.bookstoredemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;

@SpringBootTest
class BookstoreDemoApplicationTests {

    @Autowired
    DataSource dataSource;

    @Test
    void contextLoads() {
        //查看数据源
        System.out.println(dataSource.getClass());

    }

}
