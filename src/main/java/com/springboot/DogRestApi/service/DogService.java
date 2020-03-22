package com.springboot.DogRestApi.service;

import com.springboot.DogRestApi.entity.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DogService {
    List<Dog> retrieveDogs();
}
