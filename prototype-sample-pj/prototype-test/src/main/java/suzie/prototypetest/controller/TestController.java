package suzie.prototypetest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import suzie.prototypetest.domain.User;

@Controller
public class TestController {

    @GetMapping("test2")
    @ResponseBody
    public String getTestApi(@RequestParam("name") String name){
        User user = new User();
        user.setName(name);
        return name;
    }

}
