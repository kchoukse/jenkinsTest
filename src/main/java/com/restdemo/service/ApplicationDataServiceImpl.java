package com.restdemo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import com.restdemo.service.CreditBureauService;


import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.restdemo.model.ApplicationData;
import com.restdemo.repository.ApplicationDataRepository;

import com.restdemo.service.CreditBureauService;



@Service
@Transactional
public class ApplicationDataServiceImpl implements ApplicationDataService {
	
	@Autowired
	private CreditBureauService credBureauService;
	
	@Autowired
	private ApplicationDataRepository appDataRep;
	
	@Override
	public int saveApplication(ApplicationData appData) {
		appData.setDateOfSubmission(new Date());
		if(appData.getStatus() == 0)appData.setStatus(credBureauService.getStatus(appData));
		appDataRep.save(appData);
		return appData.getSsnNumber();
	}

	@Override
	public ApplicationData getLastApplication() {
		List<ApplicationData> appDataList = getApplicationList();
		return appDataList.get(appDataList.size()-1);
	}

	@Override
	public List<ApplicationData> getApplicationList() {
		List<ApplicationData> appDataList = new ArrayList<ApplicationData>();
		try{
			appDataRep.findAll().iterator().forEachRemaining(appDataList::add);
		} catch(NullPointerException e)
			{
				return null;
			}
		return appDataList;
	}

}
