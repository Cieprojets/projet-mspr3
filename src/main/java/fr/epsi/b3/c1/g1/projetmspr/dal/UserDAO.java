package fr.epsi.b3.c1.g1.projetmspr.dal;

import fr.epsi.b3.c1.g1.projetmspr.entities.User;
import org.springframework.data.repository.CrudRepository;


public interface UserDAO extends CrudRepository<User, Integer>
 {


}
