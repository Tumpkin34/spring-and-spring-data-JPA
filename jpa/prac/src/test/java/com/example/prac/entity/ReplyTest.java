package com.example.prac.entity;

import com.example.prac.repository.BoardRepository;
import com.example.prac.repository.ReplyRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Slf4j
@Transactional
@Rollback(false)
public class ReplyTest {
    @Autowired
    private BoardRepository boardRepository;
    @Autowired
    private ReplyRepository replyRepository;

    @Test
    public void saveTest(){
        Board board = new Board();
        Reply reply = new Reply();
        board.create("안녕하세요", "등업좀", "황지수");
        reply.create("방가방가","황수지");
        reply.changeBoard(board);
        boardRepository.save(board);
        replyRepository.save(reply);
    }

    @Test
    public void saveReplyTest(){
        Board board = boardRepository.findById(1L).get();
        Reply reply = new Reply();
        reply.create("처음뵙겠습니다.","홍수지");
        reply.changeBoard(board);
        replyRepository.save(reply);
    }
    
    @Test
    public void updateTest(){
        Board board = boardRepository.findById(1L).get();
        board.setBoardTitle("안녕해요");
    }

    @Test
    public void replyDelete(){
        replyRepository.deleteById(3L);
    }
}
