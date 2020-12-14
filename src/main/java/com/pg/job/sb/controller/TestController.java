package com.pg.job.sb.controller;

/**
 * @author lianzheng04
 * @version 1.0
 * @date 2020/12/14 6:46 下午
 */

import com.pg.job.sb.annoation.Log2Center;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    @Log2Center(method = "test")
    public String testDemo() {
        return "Hello World!";
    }
}
