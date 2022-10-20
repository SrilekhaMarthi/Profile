package com.example.sri.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.sri.Repo.RoleRepository;
import com.example.sri.models.Role;

@Service

public class RolesController {
    @Autowired
    RoleRepository roleRepository;
    public Role save(Role role){
        return roleRepository.save(role);

    }
   
}
