package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class VoteController {

	@GetMapping("vote")
	public String vote() {
		return "Vote";
	}

	@PostMapping("checkeligiblity")
	public String checkEligiblity(String firstName, Integer age, String gender, Model model) {

		boolean isError = false;

		if (firstName == null || firstName.trim().length() == 0) {
			isError = true;
			model.addAttribute("firstNameError", "Please Enter FirstName");
			// dataName , dataValue
			// key , value

		}

		if (age == null) {
			isError = true;
			model.addAttribute("ageError", "Please Enter Age");
		}

		if (gender == null) {
			isError = true;
			model.addAttribute("genderError", "Please Select Gender");
		}

		if (isError == true) {
			return "Vote";
		} else {

			if (gender.equals("male") && age >= 18) {
				model.addAttribute("status", "Eligible");
			} else if (gender.equals("female") && age >= 21) {
				model.addAttribute("status", "Eligible");
			} else {
				model.addAttribute("status", "Not Eligible");
			}
			model.addAttribute("firstName", firstName);
			return "VoteResult";
		}
	}

}
