package com.example.sri.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.sri.payload.Profile;
import com.example.sri.payload.ProfileService;
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class ProfilePostingControlle {
	
	@Autowired
	private ProfileService profileService;
	
	
	@PostMapping("/profilePosting")
	public Profile postprofile(@RequestBody Profile profile) {
		return profileService.postProfile(profile);
		
	}
	
   @GetMapping("/getProfile")
   public ArrayList<Profile> getAllProfiles(){
	   return profileService.getProfiles();
   }

   @GetMapping("/findOrderedprofile")
   public ArrayList<Profile> findOrderedprofile(){
	   return profileService.findOrderedprofile();
   }
   
   @GetMapping("/resultperhit/{pgno}/{pgsize}")
   public List<Profile> pageperhit(@PathVariable int pgno, @PathVariable int pgsize) {
	   return profileService.requestPerHit(pgno,pgsize);
   }

}
