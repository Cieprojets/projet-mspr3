package fr.epsi.b3.c1.g1.projetmspr.dal;

import fr.epsi.b3.c1.g1.projetmspr.entities.Tracking;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;



public interface TrackingDAO extends CrudRepository<Tracking, Integer> {
}