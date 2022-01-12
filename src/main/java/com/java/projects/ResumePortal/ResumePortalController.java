package com.java.projects.ResumePortal;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.projects.ResumePortal.models.Job;
import com.java.projects.ResumePortal.models.UserProfile;

@Controller
public class ResumePortalController {

	@Autowired
	UserProfileRepository userRepo;
	
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
	public String getProfile(@PathVariable("userId") String userName, Model model)
	{
		Optional<UserProfile> userProfile = userRepo.findByUserName(userName);
		System.out.println("UsertName:"+userName);
		userProfile.orElseThrow(() -> new RuntimeException("Not found : " + userName));
		UserProfile profile = userProfile.get();
		System.out.println("Fname-"+profile.getFirstName());
		List<Job> jobs = profile.getJobs();
		
		jobs.forEach(job -> {
			System.out.println("Current Job - "+job.isCurrentJob());
		});
		
		model.addAttribute("userProfile", profile);
		return "resume-templates/template"+profile.getId()+"/index";
		
		
	}
	
}
