package com.restdemo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.restdemo.model.ApplicantScore;

@Repository
public interface ApplicantScoreRepository extends CrudRepository<ApplicantScore, Integer> {

}

