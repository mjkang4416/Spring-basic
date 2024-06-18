package com.example.b_dependency.Lombok;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.lang.reflect.Member;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class memberTest {
    @Test
    void test(){
        member member = new member();
        member member1 = new member("강민정");


    }
}