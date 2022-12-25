package com.example.prac.domain.dao;

import com.example.prac.domain.vo.NoticeVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class NoticeDAOTest {
    @Autowired
    public NoticeDAO noticeDAO;

    @Test
    public void findAllTest() {
        noticeDAO.findAll().stream().map(NoticeVO::toString).forEach(log::info);
    }
}
