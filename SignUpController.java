package com.soumya.springbbot.springbootstudentdetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.soumya.springbbot.springbootstudentdetails.entity.User;
import com.soumya.springbbot.springbootstudentdetails.model.SignupForm;
import com.soumya.springbbot.springbootstudentdetails.repository.UserRepository;

@Controller
public class SignUpController {

	@Autowired
	private UserRepository userRepo;
	//method to get signup page
	
	@GetMapping(path="/signup")
	public String getSignupPage() {
		
		return "signup";
	}
	
	//method to submit signup
	
	@PostMapping(path="/signup")
	public String submitSignup(SignupForm signupForm)
	{
		User user=null;
		if(null!=signupForm) {
			user=new User(signupForm.getFirstName(),signupForm.getLastName() ,signupForm.getEmailId() ,signupForm.getPassword());
		}
		userRepo.save(user);
		
		return "signup-success";
	}
	
	
	
}
