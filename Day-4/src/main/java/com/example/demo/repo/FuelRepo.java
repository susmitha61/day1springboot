package com.example.demo.repo;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day4.model.PetrolBunk;

public interface FuelRepo extends JpaRepository<PetrolBunk,Integer>
{

	


}
