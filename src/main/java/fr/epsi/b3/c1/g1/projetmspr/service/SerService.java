package fr.epsi.b3.c1.g1.projetmspr.service;


import fr.epsi.b3.c1.g1.projetmspr.entities.Ser;

import java.util.List;

public interface SerService {

    Ser ajouter(Ser ser);
    List<Ser> lecture();
    Ser modifie(Integer id,Ser ser);
    String supprime(Integer id);



}
