package com.example.demo.day1.q3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ques3 
{
	   @GetMapping("/color")
       public String favColor()
       {
    	   String colorr ="pink";
    	   return "My Favorite Color is "+colorr;
       }
}

