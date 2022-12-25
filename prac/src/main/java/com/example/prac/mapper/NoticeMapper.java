package com.example.prac.mapper;

import com.example.prac.domain.dao.NoticeDAO;
import com.example.prac.domain.vo.NoticeVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NoticeMapper {
    //    전체 목록
    public List<NoticeVO> selectAll();

    //    하나 정보
    public NoticeVO selectOne(Long noticeNumber);

    public int insert(NoticeVO noticeVO);

    public int update(NoticeVO noticeVO);

    public int delete(Long noticeNumber);

}
