package com.example.app1.controller;

import com.example.app1.domain.vo.ProductVO;
import com.example.app1.service.ProductService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequiredArgsConstructor
@RequestMapping("/product/*")
@Slf4j
public class ProductController {
    private final ProductService productService;

    @GetMapping("/list")
    public void list(Model model){
        model.addAttribute("products",productService.show());
    }

    @GetMapping("/add")
    public void add(){}

    @PostMapping("/add")
    public String add(ProductVO productVO){
        log.info("add.........................");
        productService.add(productVO);
        return "/product/list";
    }

    @GetMapping(value = {"read", "update"})
    public void read(Long productNumber, Model model){
        model.addAttribute("product",productService.find(productNumber));
    }

    @PostMapping("/update")
    public RedirectView update(ProductVO productVO, RedirectAttributes redirectAttributes){
        productService.update(productVO);
        redirectAttributes.addAttribute("productNumber",productVO.getProductNumber());
        return new RedirectView("/product/list");
    }

    @PostMapping("/delete")
    public RedirectView delete(Long productNumber, RedirectAttributes redirectAttributes){
        productService.delete(productNumber);
        redirectAttributes.addAttribute("productNumber",productNumber);
        return new RedirectView("/product/list");
    }
}
