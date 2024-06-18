package com.example.b_dependency.qualifier;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class gameTest {
    @Autowired
//    @Qualifier("starCraft")
    private game game;

    @Test
    void test(){
        game.play();
    }
}