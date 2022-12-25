package com.example.app1.service;

import com.example.app1.domain.dao.ProductDAO;
import com.example.app1.domain.vo.ProductVO;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @Qualifier("toy") @Primary
@RequiredArgsConstructor
public class ToyService implements ProductService{
    private final ProductDAO productDAO;

//    전체 목록
    public List<ProductVO> show(){
        return productDAO.findAll();
    }
//    하나의 정보
    public ProductVO find(Long productNumber){
        return productDAO.findOneById(productNumber);
    }
//    추가
    public int add(ProductVO productVO){
        return productDAO.save(productVO);
    }
//    수정
    public int update(ProductVO productVO){
        return productDAO.setProduct(productVO);
    }
//    삭제
    public int delete(Long productNumber){
        return productDAO.deleteById(productNumber);
    }

}
