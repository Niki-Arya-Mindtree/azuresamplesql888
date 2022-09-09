package com.example.demo.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import com.example.demo.model.*;
import com.example.demo.reposit.Repository;

@RestController
public class Controller {

	@Autowired
	private Repository repos;

	@GetMapping("/data")
	public List<ModelClass> getall()
	{return repos.findAll();}
	
	@PostMapping("/data")
	public void saveAll(@RequestBody ModelClass mclass ) 
	{repos.saveAndFlush(mclass);}
	
}

