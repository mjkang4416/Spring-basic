package com.example.d_mybatis.mapper;

import com.example.d_mybatis.domain.BirdVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class BirdMapperTest {
    @Autowired
    BirdMapper birdMapper;
    @Test
    void selectByID(){
        log.info(birdMapper.selectById(1).toString());
    }

    @Test
    void getTimeQuickTest(){
        log.info(birdMapper.getTimeQuick());
    }

    @Test
    void selectAllTest(){
        log.info(birdMapper.selectAll().toString());
        birdMapper.selectAll().stream().map(BirdVO::toString).forEach(log::info);
        birdMapper.selectAll().forEach(birdVO -> {log.info(birdVO.toString());});
        birdMapper.selectAll().forEach(System.out::println); //sysout 은 객체 출력시 내부적으로 toString 호출해줌
    }
    @Test
    void insertTest(){
//        BirdVO birdVO = new BirdVO();
//        birdVO.setAge(10);
//        birdVO.setName("eagle");
//        birdVO.setGender("여");
         BirdVO birdVO = BirdVO.builder()
                 .age(5)
                 .name("eagle")
                 .gender("여")
                 .build();

        birdMapper.insert(birdVO);
    }

    @Test
    void updateByIdTest(){
        // 가져온 VO
        BirdVO VO = BirdVO.builder() //new 안쓰는데 메모리에 어케 잡힘?
                .id(1)
                .age(5)
                .build();

        BirdVO updateVo =  birdMapper.selectById(1);  //바꿀 객체 id 로 select
        updateVo.setAge(VO.getAge());
        log.info(String.valueOf(updateVo.getAge()));
    }

    @Test
    void deleteByIdTest(){
        BirdVO vo = BirdVO.builder().id(1).build();

        birdMapper.deleteByID(vo.getId());
    }
}