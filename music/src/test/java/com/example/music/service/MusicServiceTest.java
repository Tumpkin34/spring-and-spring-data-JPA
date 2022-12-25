package com.example.music.service;

import com.example.music.domain.vo.MusicVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

@SpringBootTest
@Slf4j
public class MusicServiceTest {
    @Autowired
    private MusicService musicService;

    @Test
    public void showTest(){
        musicService.show().stream().map(MusicVO::toString).forEach(log::info);
    }

    @Test
    public void findTest(){
        log.info(musicService.find(5L)+"");
    }

    @Test
    public void addTest(){
        MusicVO musicVO = new MusicVO();
        musicVO.setMusicTitle("서른 즈음에");
        musicVO.setMusicSinger("김광석");
        musicVO.setMusicLyrics("점점 더 멀어져 간다 머물러 있는 청춘인 줄 알았는데 비어 가는 내 가슴속엔 더 아무것도 찾을 수 없네");
        musicService.add(musicVO);
    }

    @Test
    public void updateTest(){
        MusicVO musicVO = musicService.find(11L);
        musicVO.setMusicLyrics("비어 가는 내 가슴속엔 더 아무것도 찾을 수 없네");
        musicService.update(musicVO);
    }

    @Test
    public void deleteTest(){
        musicService.delete(11L);
    }


}
