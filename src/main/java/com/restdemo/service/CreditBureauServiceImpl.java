package com.restdemo.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restdemo.model.ApplicantScore;
import com.restdemo.model.ApplicationData;
import com.restdemo.model.CreditBureau;
import com.restdemo.repository.CreditBureauRepository;
import com.restdemo.service.CreditBureauService;


@Service
public class CreditBureauServiceImpl implements CreditBureauService {
	
	@Autowired
	private CreditBureauRepository credRepo;
	
	@Autowired
	private ApplicantScoreService appScoreService;
	
	@Override
	public CreditBureau getCreditBureau(int ssnNumber) {
		Optional<CreditBureau> returnObject;
		returnObject = credRepo.findById(ssnNumber);
		if(returnObject.isPresent())
			return returnObject.get();
		else
			return new CreditBureau(ssnNumber);
	}

	@Override
	public int calculateScore(ApplicationData appData, CreditBureau credData) {
		double loanAm =  (appData.getLoanAmount() - 11235.1)/7417.56;
		double annualSal = (appData.getAnnualSalary() - 68188.1)/51014.3;
		int experience = (appData.getWorkExMonth()+(appData.getWorkExYr()*12));
		double workEx = (experience-5.03767)/3.35298;
		double score = (-0.5*loanAm) - (0.088*experience) +  (0.61*annualSal) - (0.085*credData.getDelinq_2yrs()) - (0.28*credData.getInq_last_6mths()) +  (0.044*credData.getMths_since_last_delinq()) - (0.087*credData.getMths_since_last_record()) - (0.18*credData.getOpen_acc()) - (0.10*credData.getPub_rec()) + (0.176*credData.getRevol_bal()) - (0.69*credData.getRevol_util()) + (0.099*credData.getTotal_acc()) + (0.84* (appData.getLoanPurpose()=="Credit_Card"?1:0)) + (0.40*(appData.getLoanPurpose()=="Debt_Consolidation"?1:0)) + (0.175*(appData.getLoanPurpose()=="Home_Improvement"?1:0)) + (0.30*(appData.getLoanPurpose()=="House"?1:0)) + (0.26*(appData.getLoanPurpose()=="Major_Purchase"?1:0)) - (0.135*(appData.getLoanPurpose()=="Medical"?1:0)) - (1.022*(appData.getLoanPurpose()=="Small_Business"?1:0)) - (0.226*(appData.getLoanPurpose()=="Vacation"?1:0)) + (0.457*(appData.getLoanPurpose()=="Wedding"?1:0)) - (0.00033*credData.getFeature3()) + 1.181;
		System.out.println(score);
		System.out.println(Math.exp(score));
		score = 1000/(1+(Math.exp(-score)));
		int scoreInt = (int)score;
		System.out.println(scoreInt);
		return scoreInt;
	}

	@Override
	public int getStatus(ApplicationData appData) {
		CreditBureau credData = getCreditBureau(appData.getSsnNumber());
		int score = calculateScore(appData, credData);
		ApplicantScore appScore = new ApplicantScore();
		appScore.setSsnNumber(appData.getSsnNumber());
		appScore.setScore(score);
		appScoreService.saveScore(appScore);
		if(score > 750)
			return 1;
		else
			return -1;
	}
	
}
