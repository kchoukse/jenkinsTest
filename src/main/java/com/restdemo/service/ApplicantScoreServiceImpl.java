package com.restdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restdemo.model.ApplicantScore;
import com.restdemo.model.ApplicationData;
import com.restdemo.repository.ApplicantScoreRepository;
import com.restdemo.repository.ApplicationDataRepository;


@Service
@Transactional
public class ApplicantScoreServiceImpl implements ApplicantScoreService {
	
	@Autowired
	ApplicantScoreRepository appScoreRep;
	
	@Override
	public int saveScore(ApplicantScore appScore) {
		
		if(appScoreRep.save(appScore) != null)
			return 1;
		else 
			return 0;
	}

	@Override
	public List<ApplicantScore> getApplicantScores() {
		List<ApplicantScore> appScoreList = new ArrayList<ApplicantScore>();
		try{
			appScoreRep.findAll().iterator().forEachRemaining(appScoreList::add);
		} catch(NullPointerException e)
			{
				return null;
			}
		return appScoreList;
	}

}
