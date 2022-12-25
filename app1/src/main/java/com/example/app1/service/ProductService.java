package com.example.app1.service;

import com.example.app1.domain.vo.ProductVO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    //    전체 목록
    public List<ProductVO> show();
    //    하나의 정보
    public ProductVO find(Long productNumber);
    //    물품 추가
    public int add(ProductVO productVO);
    //    물품 수정
    public int update(ProductVO productVO);
    //    물품 삭제
    public int delete(Long productNumber);
}
