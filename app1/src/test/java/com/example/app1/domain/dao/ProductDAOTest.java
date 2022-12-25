package com.example.app1.domain.dao;

import com.example.app1.domain.vo.ProductVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class ProductDAOTest {
    @Autowired
    public ProductDAO productDAO;

    @Test
    public void findAllTest(){
        productDAO.findAll().stream().map(ProductVO::toString).forEach(log::info);
    }

    @Test
    public void findOneByIdTest(){
        log.info(""+productDAO.findOneById(3l));
    }

    @Test
    public void saveTest(){
        ProductVO productVO = new ProductVO();
        productVO.setProductName("의엽님");
        productVO.setProductPrice(10000l);
        productVO.setProductCompany("주무시나요?");
        productDAO.save(productVO);
    }
    
    @Test
    public void setProductVO(){
        ProductVO productVO = productDAO.findOneById(2000l);
        Assertions.assertNotNull(productVO);
        productVO.setProductCompany("카톡확인해주세요 -지수");
        productDAO.setProduct(productVO);
    }

    @Test
    public void deleteById(){
        productDAO.deleteById(100l);
    }

}
