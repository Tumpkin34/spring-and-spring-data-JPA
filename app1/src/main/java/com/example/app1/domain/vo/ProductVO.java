package com.example.app1.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class ProductVO {
    private long productNumber;
    private String productName;
    private String productCompany;
    private long productPrice;
    private String productRegisterDate;
    private String productUpdateDate;
}
