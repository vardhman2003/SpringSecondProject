package com.springSecond.restApiSecond.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApi {
    @GetMapping("/hello")
    String fn(){
        return "Hello from BridgeLabz";
    }
}
