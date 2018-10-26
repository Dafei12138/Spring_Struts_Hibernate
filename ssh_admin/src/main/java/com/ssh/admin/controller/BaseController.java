package com.ssh.admin.controller;

import com.ssh.data.service.ICatService;
import com.ssh.data.service.impl.CatServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BaseController {

    private static ICatService catService = new CatServiceImpl();

    @RequestMapping("/helloword")
    @ResponseBody
    public String say(Model model){
        String name = catService.findNameById(1);
        model.addAttribute("name" , name);
        System.out.println("mingzi" + name);
        System.out.println("hello*********************");
        return "hello";
    }
}
