package med.voll.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //identificando que é uma classe controller de uma API REST
@RequestMapping("/hello") //Url onde esse controller irá responder
public class HelloController {

    @GetMapping
    public String helloWorld(){

        return "Hello World Spring!";
    }
}
