package com.example.prac.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class NoticeVO {
    long noticeNumber;
    String noticeTitle;
    String noticeWriter;
    String noticeContent;
    String noticeRegisterDate;
    String noticeUpdateDate;
}
