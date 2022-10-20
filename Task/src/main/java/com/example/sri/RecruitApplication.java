package com.example.sri;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.sri.Repo.UserRepository;
import com.example.sri.controller.RolesController;
import com.example.sri.models.ERole;
import com.example.sri.models.Role;

@SpringBootApplication
public class RecruitApplication implements CommandLineRunner {
	@Autowired
	RolesController rolesController;

	public static void main(String[] args) {
		SpringApplication.run(RecruitApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		rolesController.save(new Role(ERole.ROLE_USER));
		rolesController.save(new Role(ERole.ROLE_ADMIN));
		rolesController.save(new Role(ERole.ROLE_MODERATOR));
		

	}


}


