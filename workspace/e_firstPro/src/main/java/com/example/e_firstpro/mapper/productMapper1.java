package com.example.e_firstpro.mapper;

import com.example.e_firstpro.domain.vo.productVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface productMapper1 {
    void insert(productVO vo);
    List<productVO> findByName(String name);
    List<productVO> findByConditions(String name, String category, int price);

    List<productVO> findByChoose(String name, String category, int price);

    void update(productVO vo);
}
