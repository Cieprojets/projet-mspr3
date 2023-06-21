package fr.epsi.b3.c1.g1.projetmspr.service;

import fr.epsi.b3.c1.g1.projetmspr.entities.Botanist;

import java.util.List;
import java.util.Optional;

public interface BotanistService {
    Botanist creer(Botanist botanist);

    List<Botanist> lire();
    Optional<Botanist> modifier(Integer id, Botanist botanist);

    String supprimer(Integer id);

    Optional<Botanist> findById(int id);
}
