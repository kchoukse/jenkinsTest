package com.restdemo.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restdemo.model.ApplicationData;
import com.restdemo.model.JenkinsTest;
import com.restdemo.repository.JenkinsTestRepository;



@Service
@Transactional
public class JenkinsTestServiceImpl implements JenkinsTestService{
	
	@Autowired
	private JenkinsTestRepository jRep;
	
	@Override
	public int saveEmp(JenkinsTest empJTest) {
		if(jRep.save(empJTest) != null) return 1;
		else return 0;
	}

	@Override
	public List<JenkinsTest> getEmp() {
		List<JenkinsTest> empList = new ArrayList<JenkinsTest>();
		try{
			jRep.findAll().iterator().forEachRemaining(empList::add);
		} catch(NullPointerException e)
			{
				return null;
			}
		return empList;
	}
	
}
