package com.example.music.controller;

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
public class MusicControllerTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    private MockMvc mockMvc;

    @BeforeEach
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
    }

    @Test
    public void showTest() throws Exception {
        log.info(mockMvc.perform(MockMvcRequestBuilders.get("/music/list")).andReturn().getModelAndView().getModelMap().toString());
    }

    @Test
    public void readTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/music/read").param("musicNumber", "5")).andReturn().getModelAndView().getModelMap().toString();
    }

    @Test
    public void addTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/music/add")
                .param("musicTitle", "Never ending story").param("musicSinger", "부활")
                .param("musicLyrics", "그리워하면 언젠간 만나게 되는 어느 영화와 같은 일들이 이루어져 가기를"))
                .andReturn().getModelAndView().getViewName();
    }

    @Test
    public void updateTest() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.post("/music/update")
                .param("musicNumber","14")
                .param("musicTitle", "비밀").param("musicSinger", "부활")
                .param("musicLyrics", "너무나 그리워져서 너무 그리워서 너의 이름을 홀로 부르곤 해"))
                .andReturn().getModelAndView().getViewName();
    }


}
