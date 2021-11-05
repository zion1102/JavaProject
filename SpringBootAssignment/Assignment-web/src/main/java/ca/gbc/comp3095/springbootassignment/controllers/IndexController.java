package ca.gbc.comp3095.springbootassignment.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"","/","/index.html","/error"})
    public String index(){
        return "index";
    }
}
