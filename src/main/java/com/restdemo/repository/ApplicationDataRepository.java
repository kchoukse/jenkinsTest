package com.restdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restdemo.model.ApplicationData;

@Repository
public interface ApplicationDataRepository extends CrudRepository<ApplicationData, Integer> {

}

