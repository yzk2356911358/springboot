package com.yzk.springboot.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class UserController {
    @ResponseBody
    @RequestMapping("/hello")
    public String Hello() {
        return "Hell1oYzk";
    }
}
