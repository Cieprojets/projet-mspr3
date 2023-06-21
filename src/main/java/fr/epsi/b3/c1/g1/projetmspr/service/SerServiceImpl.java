package fr.epsi.b3.c1.g1.projetmspr.service;

import fr.epsi.b3.c1.g1.projetmspr.dal.ServiceDAO;
import fr.epsi.b3.c1.g1.projetmspr.entities.Ser;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SerServiceImpl implements SerService {
    private final ServiceDAO serviceDAO;

    @Override
    public Ser ajouter(Ser ser) {
        return serviceDAO.save(ser);
    }

    @Override
    public List<Ser> lecture() {
        return (List<Ser>) serviceDAO.findAll();
    }

    public Ser findById(int Id) {
        return serviceDAO.findSerById(Id);
    }

    @Override
    public Ser modifie(Integer id, Ser ser) {
        return null;
    }

   /* @Override
    public Ser modifie(Integer id, Ser ser) {
        return ;
    }*/

    @Override
    public String supprime(Integer id) {
        serviceDAO.deleteById(id);
        return "service supprimé";
    }
}