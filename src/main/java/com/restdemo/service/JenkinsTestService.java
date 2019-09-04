package com.restdemo.service;

import java.util.List;
import com.restdemo.model.JenkinsTest;


public interface JenkinsTestService {
	
	int saveEmp(JenkinsTest empJTest);
	List<JenkinsTest> getEmp();
}
