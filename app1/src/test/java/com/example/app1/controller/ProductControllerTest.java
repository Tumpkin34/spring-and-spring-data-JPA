package com.example.app1.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@Slf4j
public class ProductControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void showTest() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/product/list")).andReturn().getModelAndView().getModelMap().toString());
    }

    @Test
    public void addTest() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.post("/product/add")
                .param("productName", "자고싶다.").param("productPrice","8888")
                .param("productCompany","zzzz")).andReturn().getModelAndView().getViewName());
    }

    @Test
    public void updateTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/product/update")
        .param("productNumber","31").param("productName","언제자냐")
        .param("productCompany","자고싶다")
        ).andReturn().getModelAndView().getModelMap().toString();
    }

    @Test
    public void deleteTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/product/delete").param("productNumber","25")).andExpect(MockMvcResultMatchers.status().is3xxRedirection());
    }

}
