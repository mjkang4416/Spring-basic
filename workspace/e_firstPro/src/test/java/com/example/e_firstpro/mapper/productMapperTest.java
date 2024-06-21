package com.example.e_firstpro.mapper;

import com.example.e_firstpro.domain.vo.productVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
@Slf4j
class productMapperTest {
    @Autowired
    productMapper productMapper;

    @Test
    void insertTest(){
        productVO vo = productVO.builder()
                .name("노트북")
                .price(20.0)
                .category("전자기기")
                .description("구웃")
                .build();

        List<productVO> productVOS = productMapper.insertAll(vo);

    }
    @Test
    void selectByIDTest(){
        productVO vo = productMapper.selectByID(1);
        log.info(String.valueOf(vo));
    }

    @Test
    void selectAllTest(){
        log.info(productMapper.selectAll().toString());
    }
    @Test
    void updateTest(){
        productVO vo = productVO.builder()
                .id(1L) //long 은 뒤에 L 붙여야
                .name("아이패드")
                .price(20.0)
                .description("애플")
                .category("전자기기")
                .build();

        productMapper.updateById(vo);

    }

    @Test
    void deleteTest(){
        productMapper.delete(1);
    }
}