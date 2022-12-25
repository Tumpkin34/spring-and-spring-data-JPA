package com.example.prac.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_REPLY")
@Getter @Setter @ToString
public class Reply extends Period{
    @Id @GeneratedValue
    private Long replyId;
    private String replyContent;
    private String replyWriter;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOARD_ID")
    private Board board;

    public void create(String replyContent, String replyWriter) {
        this.replyContent = replyContent;
        this.replyWriter = replyWriter;
    }
    public void changeBoard(Board board){
        this.board = board;
    }
}
