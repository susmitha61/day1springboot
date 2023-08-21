package com.example.demo.day1.q2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ques2 
{
	  @GetMapping("/name")
       public String getname()
       {
    	   String name="Hi I am Sasha";
    	   return name;
       }         
}