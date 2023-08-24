package com.example.demo.day6.controller;

import java.util.List;


import org.springframework.web.bind.annotation.RestController;

import com.example.demo.day6.model.UserModel;
import com.example.demo.day6.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class UserController {

		@Autowired
		public UserService uservs;
		@PostMapping("/PostUsers")
		public UserModel postUsers(@RequestBody UserModel ur)
		{
			return uservs.saveUsers(ur);
		}
		//sort by asc
		@GetMapping("/sortAsc/{name}")
		public List<UserModel>sortasc(@PathVariable("name") String name)
		{
			return uservs.sortByAsc(name);
		}
		//sort by desc
		@GetMapping("/sortdsc/{name}")

	    public List<UserModel> sortByDsc(@PathVariable("name") String name)

	    {

	    	return uservs.sortbydsc(name);

	    }

	    @GetMapping("/pagination/{num}/{size}")

	    public List<UserModel> paginationDemo(@PathVariable("num") int num,@PathVariable("size") int size)

	    {

	    	return uservs.pagination(num,size);

	    }

	}
		

