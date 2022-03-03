package com.soumya.springbbot.springbootstudentdetails.model;
//model class to hold signup form data
public class SignupForm {

	
	private String firstName;
	private String lastName;
	private String emailId;
	private String password;
	
	
	public SignupForm() {
		super();
		// TODO Auto-generated constructor stub
	}


	public SignupForm(String firstName, String lastName, String emailId, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	@Override
	public String toString() {
		return "SignupForm [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", password="
				+ password + "]";
	}
	
	
}
