package com.mfortune.web.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {
    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello, user!";
    }

//    @RequestMapping("say-hello-html")
//    @ResponseBody
//    public String sayHelloHtml() {
//        some codes with stringbuilder.append("html code");
//    }
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayhello";
    }
}
