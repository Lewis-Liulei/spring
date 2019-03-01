package liulei.controller;

import liulei.controller.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/rjson")
public class TestController {
    @GetMapping("/getPerson")
    public Person getAperson(){
        return new Person("sfdfd","sdfdf",1);
    }
}
