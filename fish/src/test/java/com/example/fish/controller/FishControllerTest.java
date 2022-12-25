package com.example.fish.controller;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
@Slf4j
public class FishControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp(){
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void listTest() throws Exception{
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/fish/list")).andReturn().getModelAndView().getViewName().toString());
    }
    @Test
    public void addTest() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.post("/fish/add")
        .param("fishes[0].fishName","대왕오징어").param("fishes[0].fishCount","1")
        .param("fishes[1].fishName","거북이").param("fishes[1].fishCount","7")).andReturn();
    }
}
