package com.example.b_dependency.dependency;

import org.springframework.stereotype.Component;

@Component
public class Dtest2 {
    private final Dtest1 dTest1;

    public Dtest2(Dtest1 dTest1) {
        this.dTest1 = dTest1;
    }

    public void print2(){
        dTest1.print();
        System.out.println("Dtest2");
    }
}
