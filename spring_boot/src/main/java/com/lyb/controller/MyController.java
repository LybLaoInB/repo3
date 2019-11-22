package com.lyb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName MyController
 * @Description
 * @Author 刘永波 Lyb
 * @Date 2019/11/20 19:22
 * @Version V1.0
 **/
@Controller
public class MyController {
    @RequestMapping("/getPage")
    @ResponseBody
    public String getPage(){
        return "success";
    }
}
