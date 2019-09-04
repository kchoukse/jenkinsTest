package com.restdemo.service;

import java.util.Optional;

import com.restdemo.model.ApplicationData;
import com.restdemo.model.CreditBureau;

public interface CreditBureauService {
	CreditBureau getCreditBureau(int ssnNumber);
	int calculateScore(ApplicationData appData, CreditBureau credData);
	int getStatus(ApplicationData appData);
}
