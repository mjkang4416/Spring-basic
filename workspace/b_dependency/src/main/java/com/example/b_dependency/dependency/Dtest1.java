package com.example.b_dependency.dependency;

import ch.qos.logback.core.net.SyslogOutputStream;
import org.springframework.stereotype.Component;

@Component //스프링 컨테이너에 등록해줘 라는 의미
public class Dtest1 {
    public void print(){
        System.out.println("Dtest1");
    }
}
