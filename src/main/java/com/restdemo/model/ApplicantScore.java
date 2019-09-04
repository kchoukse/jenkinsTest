package com.restdemo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "applicantscore")
public class ApplicantScore {
	
	@Id
	@Column(name = "ssnNumber")
	private int ssnNumber;
	
	@Column(name = "score")
	private int score;

	public int getSsnNumber() {
		return ssnNumber;
	}

	public void setSsnNumber(int ssnNumber) {
		this.ssnNumber = ssnNumber;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
}
