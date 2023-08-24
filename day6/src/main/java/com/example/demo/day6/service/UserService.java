package com.example.demo.day6.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.day6.model.UserModel;

import com.example.demo.day6.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;


@Service
public class UserService {

	
	@Autowired
	public UserRepo usrepo;
	
	//post data
	public UserModel saveUsers(UserModel u)
	{
		return usrepo.save(u);
	}
	
	//sorting
			public List<UserModel>sortByAsc(String name){
			return usrepo.findAll(Sort.by(name).ascending());}
			
	//sort desc
			public List<UserModel> sortbydsc(String name)

			 {

			     return usrepo.findAll(Sort.by(name).descending());

			 }

			 public List<UserModel> pagination(int num,int size)

			 {

			     Page<UserModel> cont=usrepo.findAll(PageRequest.of(num, size));

				 return cont.getContent();

			 }

		}
	






