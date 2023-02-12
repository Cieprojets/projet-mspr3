package fr.epsi.b3.c1.g1.projetmspr.dal;

import fr.epsi.b3.c1.g1.projetmspr.entities.PlantsList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;




public interface PlantsListDAO extends CrudRepository<PlantsList, Integer>
{

}