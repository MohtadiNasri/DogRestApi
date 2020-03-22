package com.springboot.DogRestApi.service;

import com.springboot.DogRestApi.entity.Dog;
import com.springboot.DogRestApi.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DogServiceImpl implements DogService{
    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveDog(){
        return (List<Dog>) dogRepository.findAll();
    }
}
