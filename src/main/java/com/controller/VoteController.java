package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.UserBean;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class VoteController {

	@GetMapping("vote")
	public String vote() {
		return "Vote";
	}

	@PostMapping("checkeligiblity")
	public String checkEligiblity(UserBean user, Model model) {

		boolean isError = false;

		if (user.getFirstName() == null || user.getFirstName().trim().length() == 0) {
			isError = true;
			model.addAttribute("firstNameError", "Please Enter FirstName");
			// dataName , dataValue
			// key , value

		}

		if (user.getAge() == null) {
			isError = true;
			model.addAttribute("ageError", "Please Enter Age");
		}

		if (user.getGender() == null) {
			isError = true;
			model.addAttribute("genderError", "Please Select Gender");
		}

		if (isError == true) {
			return "Vote";
		} else {

			if (user.getGender().equals("male") && user.getAge() >= 18) {
				model.addAttribute("status", "Eligible");
			} else if (user.getGender().equals("female") && user.getAge() >= 21) {
				model.addAttribute("status", "Eligible");
			} else {
				model.addAttribute("status", "Not Eligible");
			}
			model.addAttribute("firstName", user.getFirstName());
			return "VoteResult";
		}
	}

}
