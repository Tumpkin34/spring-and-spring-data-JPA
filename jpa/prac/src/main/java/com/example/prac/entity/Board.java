package com.example.prac.entity;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "TBL_BOARD")
@Getter @Setter @ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Board extends Period{
    @Id @GeneratedValue
    private Long boardId;
    private String boardTitle;
    private String boardContent;
    private String boardWriter;

    public void create(String boardTitle, String boardContent, String boardWriter) {
        this.boardTitle = boardTitle;
        this.boardContent = boardContent;
        this.boardWriter = boardWriter;
    }
}
