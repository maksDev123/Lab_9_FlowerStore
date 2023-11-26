package ua.edu.apps.lab71.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.edu.apps.lab71.AppUser.AppUser;
import ua.edu.apps.lab71.repositories.UserRepository;


@Service
public class UserService {
    UserRepository UserRepository;

    @Autowired
    public UserService(UserRepository UserRepository){
        this.UserRepository = UserRepository;
    }
    public List<AppUser> findAll(){
        return UserRepository.findAll();
    }

    public AppUser save(AppUser flower){
        return UserRepository.save(flower);
    }
    
}
