package com.ibm.ro.tm.apprenticeship.poll.metter.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.ro.tm.apprenticeship.poll.metter.entity.Role;
import com.ibm.ro.tm.apprenticeship.poll.metter.repository.RoleRepository;

@RestController
public class RoleController {

	private RoleRepository repository;

	public RoleController(RoleRepository repository) {
		this.repository = repository;
	}

	@GetMapping("/roles")
	public List<Role> all() {
		return repository.findAll();
	}

}