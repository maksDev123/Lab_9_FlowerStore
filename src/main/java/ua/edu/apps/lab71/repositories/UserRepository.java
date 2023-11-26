package ua.edu.apps.lab71.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ua.edu.apps.lab71.AppUser.AppUser;

public interface UserRepository extends CrudRepository<AppUser, Long> {

    List<AppUser> findAll();
    AppUser save(AppUser flower);


}
