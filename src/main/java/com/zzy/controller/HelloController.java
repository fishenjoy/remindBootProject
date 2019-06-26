package com.zzy.controller;

import com.zzy.service.HelloService;
import com.zzy.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;

@Controller
@RequestMapping("/")
public class HelloController {
    @Autowired
    private HelloService helloService;
    @Autowired
    private IMailService iMailService;
    @Autowired
    private TemplateEngine templateEngine;

    @RequestMapping("/hello")
    @ResponseBody
    public  String helloWorld(){
        return  helloService.sayHello();
    }

    @RequestMapping("/sendEmail")
    public void sendEmail(){
        iMailService.sendSimpleMail("fishenjoy@163.com","测试","hahhahahhah");
    }
    @RequestMapping("/sendTEmail")
    public void sendtemplateMail() throws MessagingException {
        Context context=new Context();
        context.setVariable("username","zhang");
        String emailContent=templateEngine.process("Emailtemplate",context);

        iMailService.sendHtmlMail("fishenjoy@163.com","测试主题",emailContent);
        //iMailService.sendSimpleMail("fishenjoy@163.com","测试","hahhahahhah");
    }
}
