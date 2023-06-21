package fr.epsi.b3.c1.g1.projetmspr.dal;


import fr.epsi.b3.c1.g1.projetmspr.entities.Ser;
import org.springframework.data.repository.CrudRepository;
import org.springframework.lang.NonNull;

public interface ServiceDAO extends CrudRepository<Ser, Integer> {
    Ser findSerById(@NonNull Integer id);

}

