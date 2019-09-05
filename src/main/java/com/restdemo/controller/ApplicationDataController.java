package com.restdemo.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;

import com.restdemo.exception.ApplicationException;
import com.restdemo.exception.DepartmentException;
import com.restdemo.model.ApplicationData;
//import com.restdemo.model.Department;
import com.restdemo.service.ApplicationDataService;

@RestController
@RequestMapping(value="/appData")
public class ApplicationDataController {
	
	@Autowired
    private ApplicationDataService appDataService;
	
	 @CrossOrigin
	 @GetMapping("/get-last-app")
	    public ApplicationData getLastApplication(@RequestParam("ssnNumber")int ssnNumber) throws ApplicationException {
	        if(appDataService.getLastApplication()==null)
	            throw new ApplicationException("No application found for SSN number: "+ssnNumber);
	        return appDataService.getLastApplication();
	 	}
	 
	 @CrossOrigin
	 @PostMapping("/add-app")
	    public int addApplication(@RequestBody(required=true)ApplicationData appData) throws ApplicationException {   
		 ApplicationData appData1 = new ApplicationData(appData.getSsnNumber(),appData.getFirstName(),appData.getMiddleName(),appData.getLastName(),appData.getDateOfBirth(),
				 appData.getMaritalStatus(),appData.getLoanAmount(),appData.getLoanPurpose(),appData.getDescription(),appData.getAddressLine1(),
				 appData.getAddressLine2(),appData.getCity(),appData.getState(),appData.getPostalCode(),appData.getHomeNumber(),appData.getOfficeNumber(),
				 appData.getMobileNumber(),appData.getEmail(),appData.getEmployerName(),appData.getDesignation(),appData.getAnnualSalary(),appData.getWorkExYr(),
				 appData.getWorkExMonth(),appData.getEmpAddressLine1(),appData.getEmpAddressLine2(),appData.getEmpCity(),appData.getEmpState(),
				 appData.getEmpPostalCode(),appData.getStatus(),appData.getDateOfSubmission());
		 return appDataService.saveApplication(appData1);
	        
	    }
	 
	 @CrossOrigin
	 @GetMapping("/get-app-list")
	    public List<ApplicationData> getApplicationList() throws ApplicationException{
		 if(appDataService.getApplicationList()==null)
	            throw new ApplicationException("No application found");
		 return appDataService.getApplicationList();
	 }
}