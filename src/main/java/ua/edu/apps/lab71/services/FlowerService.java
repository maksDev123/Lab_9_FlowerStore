package ua.edu.apps.lab71.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.apps.lab71.item.Flower;
import ua.edu.apps.lab71.repositories.FlowerRepository;


@Service
public class FlowerService {
    FlowerRepository flowerRepository;

    @Autowired
    public FlowerService(FlowerRepository flowerRepository){
        this.flowerRepository = flowerRepository;
    }
    public List<Flower> findAll(){
        return flowerRepository.findAll();
    }

    public Flower save(Flower flower){
        return flowerRepository.save(flower);
    }
    
}
