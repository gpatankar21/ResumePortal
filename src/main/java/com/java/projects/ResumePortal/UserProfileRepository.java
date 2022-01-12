package com.java.projects.ResumePortal;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.projects.ResumePortal.models.UserProfile;

@Repository
public interface UserProfileRepository extends JpaRepository<UserProfile, Integer>{
	
	Optional<UserProfile> findByUserName(String username);

}
