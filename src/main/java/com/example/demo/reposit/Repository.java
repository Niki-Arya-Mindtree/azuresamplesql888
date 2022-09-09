package com.example.demo.reposit;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ModelClass;

public interface Repository extends JpaRepository<ModelClass, Integer>{

}
