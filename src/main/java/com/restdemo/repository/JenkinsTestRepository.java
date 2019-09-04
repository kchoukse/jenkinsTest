package com.restdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restdemo.model.JenkinsTest;

@Repository
public interface JenkinsTestRepository extends CrudRepository<JenkinsTest, Integer> {

}

