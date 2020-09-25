package com.huike.ycu.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class HiController {
    @RequestMapping("/hi")
    @ResponseBody
    public String sayHello(String msg){
        return "hellow "+msg;
    }
}
