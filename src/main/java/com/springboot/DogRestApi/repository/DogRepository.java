package com.springboot.DogRestApi.repository;

import com.springboot.DogRestApi.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, String> {

}
