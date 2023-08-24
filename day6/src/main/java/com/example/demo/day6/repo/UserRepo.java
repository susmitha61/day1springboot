package com.example.demo.day6.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.day6.model.UserModel;
@Repository
public interface UserRepo  extends JpaRepository<UserModel,Integer>{

}
