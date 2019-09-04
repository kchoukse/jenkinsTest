package com.restdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restdemo.exception.ApplicationException;
import com.restdemo.model.ApplicantScore;
import com.restdemo.service.ApplicantScoreService;

@RestController
@RequestMapping(value="/appScore")
public class ApplicantScoreController {
	
	@Autowired
	private ApplicantScoreService appScoreService;
	
	
	 @CrossOrigin(origins = "http://localhost:4200")
	 @GetMapping("/get-score-list")
	    public List<ApplicantScore> getApplicantScoreList() throws ApplicationException{
		 if(appScoreService.getApplicantScores()==null)
	            throw new ApplicationException("No scores found");
		 return appScoreService.getApplicantScores();
	 }
}
