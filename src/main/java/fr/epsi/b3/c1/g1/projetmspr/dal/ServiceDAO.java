package fr.epsi.b3.c1.g1.projetmspr.dal;


import org.springframework.data.repository.CrudRepository;
import fr.epsi.b3.c1.g1.projetmspr.entities.Service;

public interface ServiceDAO extends CrudRepository<Service, Integer> {
}

