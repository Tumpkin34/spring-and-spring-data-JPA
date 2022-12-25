package com.example.prac.domain.dao;

import com.example.prac.domain.vo.NoticeVO;
import com.example.prac.mapper.NoticeMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class NoticeDAO {
    private final NoticeMapper noticeMapper;

    public List<NoticeVO> findAll() {
        return noticeMapper.selectAll();
    }

    public NoticeVO findOne(Long noticeNumber) {
        return noticeMapper.selectOne(noticeNumber);
    }

    public int save(NoticeVO noticeVO) {
        return noticeMapper.insert(noticeVO);
    }
}
