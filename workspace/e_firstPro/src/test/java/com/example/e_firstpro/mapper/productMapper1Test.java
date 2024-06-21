package com.example.e_firstpro.mapper;

import com.example.e_firstpro.domain.vo.productVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class productMapper1Test {
    @Autowired
    productMapper1 productMapper1;

    @Test
    void findByNameTest(){
        String search =null;

        List<productVO> productVOS = productMapper1.findByName(search);
        log.info("검색 결과 개수 "+ productVOS.size());
        productVOS.stream().map(productVO::toString).forEach(log::info) ;
    }
    @Test
    void findByConditionsTest(){
//        String name=null;
//        String category = "전자기기";
//        int price = 300;

        String name=null;
        String category =null;
        int price = 0;

        List<productVO> productVOS = productMapper1.findByConditions(name,category,price);
        log.info("검색 결과 개수 "+ productVOS.size());
        productVOS.stream().map(productVO::toString).forEach(log::info) ;
    }
    @Test
    void findByChooseTest(){
        String name=null;
        String category = "전자기기";
        int price = 300;

        List<productVO> productVOS = productMapper1.findByChoose(name,category,price);
        log.info("검색 결과 개수 "+ productVOS.size());
        productVOS.stream().map(productVO::toString).forEach(log::info) ;
    }

    @Test
    void updateTest(){
        productVO vo = productVO.builder()
                .id(10L) //long 은 뒤에 L 붙여야
                .name("랄라")
                .category("전자기기")
                .build();

        productMapper1.update(vo);
    }
}