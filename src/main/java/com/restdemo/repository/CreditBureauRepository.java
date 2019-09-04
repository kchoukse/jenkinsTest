package com.restdemo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

import com.restdemo.model.CreditBureau;

@Repository
public interface CreditBureauRepository extends CrudRepository<CreditBureau, Integer> {

}
