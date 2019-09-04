package com.restdemo.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "credbureau")
public class CreditBureau {
	
	
	public CreditBureau() {
		
	}
	public CreditBureau(int ssnNumber) {
		super();
		this.ssnNumber = ssnNumber;
		this.delinq_2yrs = -0.301079346;
		this.inq_last_6mths = 0.123130404;
		this.mths_since_last_delinq = 0.701595317;
		this.mths_since_last_record = 0.215147935;
		this.open_acc = -0.073646956;
		this.pub_rec = -0.229962366;
		this.revol_bal = -0.2846760155;
		this.revol_util = 0.001752507;
		this.total_acc = 0.110249471999999;
		this.feature1 = 0.099990519;
		this.feature3 = 0.000267648;
	}

	
	@Id
	@Column(name="id")
	int ssnNumber;
	
	@Column(name="delinq_2yrs")
	double delinq_2yrs;
	
	@Column(name="inq_last_6mths")
	double inq_last_6mths;
	
	@Column(name="mths_since_last_delinq")
	double mths_since_last_delinq;
	
	@Column(name="mths_since_last_record")
	double mths_since_last_record;
	
	@Column(name="open_acc")
	double open_acc;
	
	@Column(name="pub_rec")
	double pub_rec;
	
	@Column(name="revol_bal")
	double revol_bal;
	
	@Column(name="revol_util")
	double revol_util;
	
	@Column(name="total_acc")
	double total_acc;
	
	@Column(name="feature1")
	double feature1;
	
	@Column(name="feature3")
	double feature3;

	public int getSsnNumber() {
		return ssnNumber;
	}

	public void setSsnNumber(int ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public double getDelinq_2yrs() {
		return delinq_2yrs;
	}

	public void setDelinq_2yrs(double delinq_2yrs) {
		this.delinq_2yrs = delinq_2yrs;
	}

	public double getInq_last_6mths() {
		return inq_last_6mths;
	}

	public void setInq_last_6mths(double inq_last_6mths) {
		this.inq_last_6mths = inq_last_6mths;
	}

	public double getMths_since_last_delinq() {
		return mths_since_last_delinq;
	}

	public void setMths_since_last_delinq(double mths_since_last_delinq) {
		this.mths_since_last_delinq = mths_since_last_delinq;
	}

	public double getMths_since_last_record() {
		return mths_since_last_record;
	}

	public void setMths_since_last_record(double mths_since_last_record) {
		this.mths_since_last_record = mths_since_last_record;
	}

	public double getOpen_acc() {
		return open_acc;
	}

	public void setOpen_acc(double open_acc) {
		this.open_acc = open_acc;
	}

	public double getPub_rec() {
		return pub_rec;
	}

	public void setPub_rec(double pub_rec) {
		this.pub_rec = pub_rec;
	}

	public double getRevol_bal() {
		return revol_bal;
	}

	public void setRevol_bal(double revol_bal) {
		this.revol_bal = revol_bal;
	}

	public double getRevol_util() {
		return revol_util;
	}

	public void setRevol_util(double revol_util) {
		this.revol_util = revol_util;
	}

	public double getTotal_acc() {
		return total_acc;
	}

	public void setTotal_acc(double total_acc) {
		this.total_acc = total_acc;
	}

	public double getFeature1() {
		return feature1;
	}

	public void setFeature1(double feature1) {
		this.feature1 = feature1;
	}

	public double getFeature3() {
		return feature3;
	}

	public void setFeature3(double feature3) {
		this.feature3 = feature3;
	}
	
}
