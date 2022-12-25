package com.example.music.mapper;

import com.example.music.domain.vo.MusicVO;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class MusicMapperTest {
    @Autowired
    public MusicMapper musicMapper;

//    전체 조회
    @Test
    public void getListTest(){
        musicMapper.getList().stream().map(MusicVO::toString).forEach(log::info);
    }

//    조회
    @Test
    public void selectTest(){
        log.info(musicMapper.select(8L)+"");
    }

//    추가
    @Test
    public void insertTest(){
        MusicVO musicVO = new MusicVO();
        musicVO.setMusicTitle("비행기");
        musicVO.setMusicLyrics("Yes turtles forth album new mind new song\n" +
                "철없을 적 내 기억속에 비행기 타고가요\n" +
                "Yeh let's go\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요\n" +
                "모든 준비 다 끝났어 곱게 차려 입고 나선\n" +
                "바깥 풍경마저 들뜬 기분 때가 왔어\n" +
                "하늘위로 날으는 순간이야 조금은 두려워도\n" +
                "애써 내색 할 순 없어 이번이 처음이지만\n" +
                "전에 자주 비행했었잖아 친구들과 말썽장이\n" +
                "거북이 비행기로 올라탈 준비됐나\n" +
                "수많은 사람들 속을 지나쳐 마지막 게이트야\n" +
                "나도 모르게 안절부절하고 있어\n" +
                "이럴 땐 침착해 좀 자연스럽게\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요 Yes remember\n" +
                "비행기를 타고 가던 너 따라가고 싶어 울었던\n" +
                "철없을 적 내 기억속에 비행기 타고가요\n" +
                "Yes fly 다들 아무 일도 없는 듯\n" +
                "하늘을 나르는데 아무걱정 없는 듯\n" +
                "왠지 철닥서니 없었나 문득\n" +
                "이런 내 모습 촌스러 입 다문듯\n" +
                "쳐다보지 말아요\n" +
                "다들 처음 탈 때 이러지 않았나요\n" +
                "딴 데 봐요 신경 쓰지 마요\n" +
                "나 혼자 이런게 나 좋아요\n" +
                "어떤 느낌일까 정말 새들처럼 나는 기분\n" +
                "세상 모든 것이 점처럼 보여 지겠지 개구쟁이\n" +
                "거북이 비행기로 드디어 출발한다\n" +
                "수많은 사람들 속을 지나쳐 마지막 게이트야\n" +
                "나도 모르게 안절부절하고 있어\n" +
                "이럴 땐 침착해 좀 자연스럽게\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요 Yes remember\n" +
                "비행기를 타고 가던 너 따라가고 싶어 울었던\n" +
                "철없을 적 내 기억속에 비행기 타고가요\n" +
                "Yeh let's go");
        musicVO.setMusicSinger("거북이");
        musicMapper.insert(musicVO);
    }

//    수정
    @Test
    public void updateTest(){
        MusicVO musicVO = musicMapper.select(5L);
        musicVO.setMusicLyrics("Yes turtles forth album new mind new song\n" +
                "철없을 적 내 기억속에 비행기 타고가요\n" +
                "Yeh let's go\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요\n" +
                "모든 준비 다 끝났어 곱게 차려 입고 나선\n" +
                "바깥 풍경마저 들뜬 기분 때가 왔어\n" +
                "하늘위로 날으는 순간이야 조금은 두려워도\n" +
                "애써 내색 할 순 없어 이번이 처음이지만\n" +
                "전에 자주 비행했었잖아 친구들과 말썽장이\n" +
                "거북이 비행기로 올라탈 준비됐나\n" +
                "수많은 사람들 속을 지나쳐 마지막 게이트야\n" +
                "나도 모르게 안절부절하고 있어\n" +
                "이럴 땐 침착해 좀 자연스럽게\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요 Yes remember\n" +
                "비행기를 타고 가던 너 따라가고 싶어 울었던\n" +
                "철없을 적 내 기억속에 비행기 타고가요\n" +
                "Yes fly 다들 아무 일도 없는 듯\n" +
                "하늘을 나르는데 아무걱정 없는 듯\n" +
                "왠지 철닥서니 없었나 문득\n" +
                "이런 내 모습 촌스러 입 다문듯\n" +
                "쳐다보지 말아요\n" +
                "다들 처음 탈 때 이러지 않았나요\n" +
                "딴 데 봐요 신경 쓰지 마요\n" +
                "나 혼자 이런게 나 좋아요\n" +
                "어떤 느낌일까 정말 새들처럼 나는 기분\n" +
                "세상 모든 것이 점처럼 보여 지겠지 개구쟁이\n" +
                "거북이 비행기로 드디어 출발한다\n" +
                "수많은 사람들 속을 지나쳐 마지막 게이트야\n" +
                "나도 모르게 안절부절하고 있어\n" +
                "이럴 땐 침착해 좀 자연스럽게\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요 Yes remember\n" +
                "비행기를 타고 가던 너 따라가고 싶어 울었던\n" +
                "철없을 적 내 기억속에 비행기 타고가요\n" +
                "Yeh let's goYes turtles forth album new mind new song\n" +
                "철없을 적 내 기억속에 비행기 타고가요\n" +
                "Yeh let's go\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요\n" +
                "모든 준비 다 끝났어 곱게 차려 입고 나선\n" +
                "바깥 풍경마저 들뜬 기분 때가 왔어\n" +
                "하늘위로 날으는 순간이야 조금은 두려워도\n" +
                "애써 내색 할 순 없어 이번이 처음이지만\n" +
                "전에 자주 비행했었잖아 친구들과 말썽장이\n" +
                "거북이 비행기로 올라탈 준비됐나\n" +
                "수많은 사람들 속을 지나쳐 마지막 게이트야\n" +
                "나도 모르게 안절부절하고 있어\n" +
                "이럴 땐 침착해 좀 자연스럽게\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요 Yes remember\n" +
                "비행기를 타고 가던 너 따라가고 싶어 울었던\n" +
                "철없을 적 내 기억속에 비행기 타고가요\n" +
                "Yes fly 다들 아무 일도 없는 듯\n" +
                "하늘을 나르는데 아무걱정 없는 듯\n" +
                "왠지 철닥서니 없었나 문득\n" +
                "이런 내 모습 촌스러 입 다문듯\n" +
                "쳐다보지 말아요\n" +
                "다들 처음 탈 때 이러지 않았나요\n" +
                "딴 데 봐요 신경 쓰지 마요\n" +
                "나 혼자 이런게 나 좋아요\n" +
                "어떤 느낌일까 정말 새들처럼 나는 기분\n" +
                "세상 모든 것이 점처럼 보여 지겠지 개구쟁이\n" +
                "거북이 비행기로 드디어 출발한다\n" +
                "수많은 사람들 속을 지나쳐 마지막 게이트야\n" +
                "나도 모르게 안절부절하고 있어\n" +
                "이럴 땐 침착해 좀 자연스럽게\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요\n" +
                "파란 하늘위로 훨훨 날아가겠죠\n" +
                "어려서 꿈꾸었던 비행기 타고\n" +
                "기다리는 동안 아무말도 못해요\n" +
                "내 생각 말할순 없어요 Yes remember\n" +
                "비행기를 타고 가던 너 따라가고 싶어 울었던\n" +
                "철없을 적 내 기억속에 비행기 타고가요\n" +
                "Yeh let's go");
        musicMapper.update(musicVO);
    }

//    삭제
    @Test
    public void deleteTest(){
        musicMapper.delete(7L);
    }

}
