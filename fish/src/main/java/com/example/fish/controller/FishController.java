package com.example.fish.controller;

import com.example.fish.domain.vo.FishVO;
import com.example.fish.service.FishService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/fish/*")
@RequiredArgsConstructor
public class FishController {
    private final FishService fishService;

    @GetMapping("/list")
    public void list(Model model){
        model.addAttribute("fishes",fishService.showAll());
    }

    @PostMapping("/add")
    public void add(FishVO fishVO){
        fishService.add(fishVO.getFishes());
    }

}
