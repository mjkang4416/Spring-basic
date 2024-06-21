package com.example.d_mybatis.mapper;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Slf4j
class TimeMapperTest {

    @Autowired
    TimeMapper timeMapper;

    @Test
    void TimeMapperTest(){
        log.info(timeMapper.getTime());
    }

}