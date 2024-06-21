package com.example.d_mybatis.mapper;

import com.example.d_mybatis.domain.BirdVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BirdMapper {
    String getTime();
    BirdVO selectById(int id);
    @Select("select sysdate from dual")
    String getTimeQuick();
    List<BirdVO> selectAll();
    void insert(BirdVO vo);

    void insertUpdateById(BirdVO vo);

    void deleteByID(int id);
}
