package com.example.demo.day1.q1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ques1

{

      @GetMapping("/welcome")

      public String welcome()

      {

    	  return"Welcome to SpringBoot";

      }

}

