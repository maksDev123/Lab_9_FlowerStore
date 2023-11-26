package ua.edu.apps.lab71.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import ua.edu.apps.lab71.item.Flower;
import ua.edu.apps.lab71.services.FlowerService;


@RestController
public class FlowerController{
	FlowerService flowerService;

	@Autowired
	public FlowerController(FlowerService flowerService){
		this.flowerService = flowerService;
	}

    @GetMapping("api/v1/flower")
	public java.util.List<Flower> hello(){
		return flowerService.findAll();
	}
	@PostMapping("api/v1/flower")
	public Flower save(@RequestBody Flower flower){
		return flowerService.save(flower);
	}
}
