package spring.jvargas.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"/", "", "index", "index.html"})
    public String index(){
        return "index"; //Thymeleaf will go to search the index page
    }
}
