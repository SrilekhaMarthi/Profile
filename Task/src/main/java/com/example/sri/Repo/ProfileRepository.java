package com.example.sri.Repo;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.sri.payload.Profile;
@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long>{
	@Query(value="SELECT * from Profile ORDER BY id",nativeQuery=true)
	public ArrayList<Profile> findOrderedprofile();
	
	
}
