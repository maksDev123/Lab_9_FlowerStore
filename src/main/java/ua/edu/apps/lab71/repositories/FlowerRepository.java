package ua.edu.apps.lab71.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import ua.edu.apps.lab71.item.Flower;

public interface FlowerRepository extends CrudRepository<Flower, Long> {

    List<Flower> findAll();
    Flower save(Flower flower);


}
