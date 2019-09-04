package com.restdemo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.restdemo.exception.ApplicationException;
import com.restdemo.exception.DepartmentException;
import com.restdemo.model.ApplicantScore;
import com.restdemo.model.ApplicationData;
import com.restdemo.model.JenkinsTest;
//import com.restdemo.model.Department;
import com.restdemo.service.ApplicationDataService;
import com.restdemo.service.JenkinsTestService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping(value="/jenkyTest")
public class JenkinsTestController {
	
	@Autowired
	private JenkinsTestService jService;
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	 @RequestMapping(method = RequestMethod.GET, value = "/getEmp")
	    public List<JenkinsTest> getEmpList() throws ApplicationException{
		 if(jService.getEmp()==null)
	            throw new ApplicationException("No scores found");
		 return jService.getEmp();
	 }
	
	@CrossOrigin(origins = "*", allowedHeaders = "*")
	@RequestMapping(method = RequestMethod.POST, value = "saveEmp")
	    public int saveEmp(@RequestBody(required=true)JenkinsTest empJTest) throws ApplicationException{
		 return jService.saveEmp(empJTest);
	 }
	
	
}
