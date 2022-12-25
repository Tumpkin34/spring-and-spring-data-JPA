package com.example.app1.mapper;

import com.example.app1.domain.vo.ProductVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductMapper {
//    전체 목록
    public List<ProductVO> selectAll();
//    하나의 정보
    public ProductVO selectOne(Long productNumber);
//    물품 추가
    public int insert(ProductVO productVO);
//    물품 수정
    public int update(ProductVO productVO);
//    물품 삭제
    public int delete(Long productNumber);
}
