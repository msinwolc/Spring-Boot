package com.shixun.orderingsystem.pay;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {
    @RequestMapping("toindex")
    public String toindex(){
        return "list";
    }
}
