package com.example.e_firstpro.mapper;

import com.example.e_firstpro.domain.vo.productVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface productMapper {
    productVO selectByID(int id);
    productVO selectAll();
    List<productVO> insertAll(productVO vo);
    void updateById(productVO vo);
    void delete(int id);

}
