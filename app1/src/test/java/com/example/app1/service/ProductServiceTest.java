package com.example.app1.service;

import com.example.app1.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductServiceTest {
    @Autowired
    private ProductService productService;

    @Test
    public void showTest(){
        productService.show().stream().map(ProductVO::toString).forEach(log::info);
    }

    @Test
    public void findTest(){
        log.info(""+productService.find(29l));
    }

    @Test
    public void addTest(){
        ProductVO productVO = new ProductVO();
        productVO.setProductName("거북이");
        productVO.setProductPrice(50000l);
        productVO.setProductCompany("비행기");
        productService.add(productVO);
    }

    @Test
    public void updateTest(){
        ProductVO productVO = productService.find(30l);
        Assertions.assertNotNull(productVO);
        productVO.setProductPrice(100000);
        productService.update(productVO);
    }

    @Test
    public void deleteTest(){
        productService.delete(28l);
    }
}
