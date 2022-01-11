package com.java.projects.ResumePortal;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ResumePortalController {

	@GetMapping("/")
	public String getResponse()
	{
		return "Hello";
	}
	
	@GetMapping("/edit")
	public String editResponse()
	{
		return "Edit";
	}
	
	@GetMapping("/view/{userId}")
	public String getProfile(@PathVariable("userId") String userId, Model model)
	{
		model.addAttribute(userId);
		return "resume-templates/template2/index";
	}
}
