package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.day4.model.PetrolBunk;
import com.example.demo.repo.FuelRepo;

@Service
public class FuelService
{
	@Autowired
	public FuelRepo frepo;
	public PetrolBunk saveDetails(PetrolBunk p)
	{
		return frepo.save(p);
	}
	public List<PetrolBunk> getDetails()
	{
		return frepo.findAll();
	}
}