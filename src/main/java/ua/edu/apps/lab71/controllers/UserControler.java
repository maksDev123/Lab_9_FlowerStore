package ua.edu.apps.lab71.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.apps.lab71.AppUser.AppUser;
import ua.edu.apps.lab71.services.UserService;

@RestController
public class UserControler{
	UserService UserService;

	@Autowired
	public UserControler(UserService UserService){
		this.UserService = UserService;
	}

    @GetMapping("api/v1/flower")
	public java.util.List<AppUser> hello(){
		return UserService.findAll();
	}
	@PostMapping("api/v1/flower")
	public AppUser save(@RequestBody AppUser flower){
		return UserService.save(flower);
	}
}
