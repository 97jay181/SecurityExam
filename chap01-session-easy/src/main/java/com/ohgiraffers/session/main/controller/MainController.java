package com.ohgiraffers.session.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping(value = {"/", "/main"})
    public ModelAndView main(ModelAndView mv) {
        mv.setViewName("main/main");
        return mv;
    }

    // 관리자 페이지로 이동
    @GetMapping("/admin/page")
    public ModelAndView adminPage(ModelAndView mv) {
        mv.setViewName("admin/admin");  // 실제 관리자 페이지 경로로 설정
        return mv;
    }

    // 사용자 페이지로 이동
    @GetMapping("/user/page")
    public ModelAndView userPage(ModelAndView mv) {
        mv.setViewName("user/user");  // 실제 사용자 페이지 경로로 설정
        return mv;
    }
}
