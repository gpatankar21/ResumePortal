package com.java.projects.ResumePortal.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResumePortalController {

	@GetMapping("/")
	public String getResponse()
	{
		return "Hello";
	}
}
