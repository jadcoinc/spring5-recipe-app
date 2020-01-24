package guru.springframework.recipeapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class IndexController {

    @RequestMapping(value= {"", "/", "index"}, method=RequestMethod.GET)
    public String getIndexPage(Model model) {
//        model.addAttribute(attributeName, attributeValue);
        System.out.println("Some message to say... 1234");
        return "index";
    }
    
}
