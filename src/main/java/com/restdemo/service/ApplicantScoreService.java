package com.restdemo.service;

import java.util.List;

import com.restdemo.model.ApplicantScore;


public interface ApplicantScoreService {
	
	int saveScore(ApplicantScore appScore);
	List<ApplicantScore> getApplicantScores();

}
