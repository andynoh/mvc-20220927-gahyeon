package com.study.mvc20220927gahyeon.controller;

import com.study.mvc20220927gahyeon.dto.TestReqDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.model.IAttribute;

@Controller
public class PageController {

    @GetMapping("/test1") //("/요청링크주소") = uri
    public String test1(){ //호출
        return "test_page1"; //리턴 "파일명" :응답데이터
    }

    @GetMapping("/test2")
    public String test2(){
        System.out.println("test2");
        return "test/test_page2"; //파일경로 따짐
    }

    @GetMapping("/test3")
    public String test3(Model model, @RequestParam String strData,@RequestParam String name){ //2개의 데이터 받기
        System.out.println(strData);
        System.out.println(name);

        model.addAttribute("data",strData);
        model.addAttribute("name",name);

        return "test/test_page3";
    }

    @GetMapping("/test4")
    public String test4(Model model, TestReqDto testReqDto){
        //System.out.println(testReqDto.getStrData());
        //System.out.println(testReqDto.getName());
        //System.out.println(testReqDto.getNumber());
        System.out.println(testReqDto);

        model.addAttribute("data",testReqDto.getStrData());
        model.addAttribute("name",testReqDto.getName());
        model.addAttribute("number",testReqDto.getNumber());

        return "test/test_page4";
    }
}
