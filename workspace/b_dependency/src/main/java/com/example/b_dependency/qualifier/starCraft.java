package com.example.b_dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class starCraft implements game{
    @Override
    public void play(){
        log.info("play sta");
    }
}
