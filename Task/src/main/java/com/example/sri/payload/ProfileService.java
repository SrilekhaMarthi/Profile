package com.example.sri.payload;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.example.sri.Repo.ProfileRepository;

@Service
public class ProfileService {

	@Autowired
	private ProfileRepository profileRepository;
	
	public Profile postProfile(Profile profile) {
		return profileRepository.save(profile);
	}
	
	public ArrayList<Profile> getProfiles(){
		return (ArrayList<Profile>) profileRepository.findAll();
	}
	
	
	public ArrayList<Profile> findOrderedprofile(){
		return profileRepository.findOrderedprofile();
	}
	
	public List<Profile> requestPerHit(int pgno,int pgsize) {
        Pageable paging = (Pageable) PageRequest.of(pgno, pgsize);
        Page<Profile> pagedResult = profileRepository.findAll(paging);
        return pagedResult.toList();

	}
	
//	public ArrayList<Profile> getcorresProfiles(){
//		
//		ArrayList<String> glist = (ArrayList<Profile>) profileRepository.findAll();
//		return ( glist.stream().filter(str->str.getPhoneno().
//				getstr.getPhoneno().endsWith("88")).map
//	}
	
}
