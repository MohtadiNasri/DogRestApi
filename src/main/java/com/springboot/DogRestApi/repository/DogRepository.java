package com.springboot.DogRestApi.repository;

import com.springboot.DogRestApi.entity.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DogRepository extends CrudRepository<Dog, String> {

}
