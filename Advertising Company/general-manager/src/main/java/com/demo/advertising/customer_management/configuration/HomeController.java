package com.demo.advertising.customer_management.configuration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String index() { return "redirect:/swagger-ui.html"; }

}
