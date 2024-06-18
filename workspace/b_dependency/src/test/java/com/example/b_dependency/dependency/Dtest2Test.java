package com.example.b_dependency.dependency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class Dtest2Test {

    @Autowired
    private Dtest2 dtest2;

    @Test
    void test() {
    dtest2.print2();
    }
}