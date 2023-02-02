package fr.epsi.b3.c1.g1.projetmspr.dal;

import fr.epsi.b3.c1.g1.projetmspr.entities.Tracking;
import org.springframework.data.repository.CrudRepository;


public interface TrackingDAO extends CrudRepository<Tracking, Integer> {
}