package web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Администратор on 09.03.2016.
 */
@Controller
@EnableAutoConfiguration
public class SimpleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "<input type=text placeholder=asd>";
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleController.class,args);
    }
}
