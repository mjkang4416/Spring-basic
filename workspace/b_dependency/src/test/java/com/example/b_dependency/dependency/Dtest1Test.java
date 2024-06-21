package com.example.b_dependency.dependency;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest //test 하기위한 프로젝트다
//class Dtest1Test {
//    //필드주입
////    @Autowired
//    private Dtest1 dtest1; //final 을 못붙임. 이 함수 안에서 수정하면 이 class 의 다음함수에 반영될 수 있다.

    //setter 주입
//    @Autowired test 환경에선 무조건 붙여줘야
//    public void setDTest1(Dtest1 dtest1){
//        this.dtest1 = dtest1;
//    }

    //생성자 주입 먼저 빈 생성하지 않고 주입하려는 빈 먼저 찾아서 순환참조가 방지됨.
    //필드 주입은 빈 생성하고 주입하는 방식임으로 메서드 실행 후에 순환참조를 발견하게 된다.
//    @Autowired
//    public Dtest1Test(Dtest1 dtest1){
//        this.dtest1 = dtest1;
//    }

//    @Test
//    void print() {
//        Dtest1 test1 = new Dtest1();
//        test1.print();
//        dtest1.print();
//    }
//}