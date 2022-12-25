package com.example.app1.product;

import com.example.app1.domain.vo.ProductVO;
import com.example.app1.mapper.ProductMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductTest {
    @Autowired
    public ProductMapper productMapper;

    @Test
    public void selectAllTest(){
        productMapper.selectAll().stream().map(ProductVO::toString).forEach(log::info);
    }
    @Test
    public void selectOne(){
        log.info("selectOne : "+productMapper.selectOne(3L));
    }
    @Test
    public void insert(){
        ProductVO productVO = new ProductVO();
        productVO.setProductName("몽키스패너");
        productVO.setProductPrice(3000L);
        productVO.setProductCompany("맘스터치");
        productMapper.insert(productVO);
    }
    @Test
    public void update(){
        ProductVO productVO = productMapper.selectOne(27L);
        productVO.setProductPrice(30000L);
        productMapper.update(productVO);
    }
    @Test
    public void delete(){
        productMapper.delete(27l);
    }
}
