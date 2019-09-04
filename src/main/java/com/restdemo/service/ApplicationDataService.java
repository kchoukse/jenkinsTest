package com.restdemo.service;

import java.util.List;

import com.restdemo.model.ApplicationData;


public interface ApplicationDataService {
	
	int saveApplication(ApplicationData appData);
    ApplicationData getLastApplication();
	List<ApplicationData> getApplicationList();

}
