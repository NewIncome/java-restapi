package com.jalfredev.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   //Annotation for controller with http requests
public class HelloWorldController {
  
  @GetMapping(path="/hello")    //Annotation for a Get request
  public String helloWorld() {
    return "Hello World";
  }
}
