package com.example.app1.domain.dao;

import com.example.app1.domain.vo.ProductVO;
import com.example.app1.mapper.ProductMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ProductDAO {
    private final ProductMapper productMapper;
    //    전체 목록
    public List<ProductVO> findAll(){
        return productMapper.selectAll();
    };
    //    하나의 정보
    public ProductVO findOneById(Long productNumber){
        return productMapper.selectOne(productNumber);
    };
    //    물품 추가
    public int save(ProductVO productVO){
        return productMapper.insert(productVO);
    };
    //    물품 수정
    public int setProduct(ProductVO productVO){
        return productMapper.update(productVO);
    };
    //    물품 삭제
    public int deleteById(Long productNumber){
        return productMapper.delete(productNumber);
    };
}
