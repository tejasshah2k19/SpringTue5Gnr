package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bean.GradeBean;

@Controller
public class GradeController {

	@GetMapping("inputmarks")
	public String inputMarks() {
		return "InputMarks";
	}

	@PostMapping("calculateresult")
	public String calculateResult(@Validated GradeBean gradeBean, BindingResult result) {
		if (result.hasErrors()) {
			return "InputMarks";
		} else {
			// read -> bean
			return "GradeResult";
		}
	}
}
