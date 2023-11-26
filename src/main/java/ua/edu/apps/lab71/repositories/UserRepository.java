package ua.edu.apps.lab71.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import ua.edu.apps.lab71.AppUser.AppUser;

public interface UserRepository extends CrudRepository<AppUser, Long> {
    @Query("SELECT u FROM AppUser u WHERE u.email = ?1")
    Optional<AppUser> findUserByEmail(String email);

    List<AppUser> findAll();
    AppUser save(AppUser flower);


}
