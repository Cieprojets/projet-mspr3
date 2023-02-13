package fr.epsi.b3.c1.g1.projetmspr.service;

import fr.epsi.b3.c1.g1.projetmspr.dal.BotanistDAO;
import fr.epsi.b3.c1.g1.projetmspr.entities.Botanist;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor

public class BotanistServiceImpl implements BotanistService {
    private final BotanistDAO botanistDAO;

    @Override
    public Botanist creer(Botanist botanist) {
        return botanistDAO.save(botanist);
    }

    @Override
    public List<Botanist> lire() {
        return (List<Botanist>) botanistDAO.findAll();
    }

    @Override
    public Optional<Botanist> modifier(Integer id, Botanist botanist) {
        return Optional.empty();
    }

   /* @Override
    public Optional<Botanist> modifier(Integer id, Botanist botanist) {
        return botanistDAO.findById(id)
        .map(b-> {
            b.setLastname(botanist.getLastname());
            b.setFirstname(botanist.getFirstname());
            b.setNumEmployee(botanist.getNumEmployee());
            return botanistDAO.save(b);
        }).orElseTrows(() -> new RuntimeException("Botanist non trouvé"));
    }*/

    @Override
    public String supprimer(Integer id) {
        botanistDAO.deleteById(id);
        return "Botanist supprimé";
    }
}
