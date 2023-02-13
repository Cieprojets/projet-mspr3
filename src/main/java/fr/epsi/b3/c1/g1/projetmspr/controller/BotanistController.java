package fr.epsi.b3.c1.g1.projetmspr.controller;

import fr.epsi.b3.c1.g1.projetmspr.entities.Botanist;
import fr.epsi.b3.c1.g1.projetmspr.service.BotanistService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/botanist")
@AllArgsConstructor
public class BotanistController {
    private final BotanistService botanistService;
    @PostMapping("/create")
    public Botanist create(@RequestBody Botanist botanist){
        return botanistService.creer(botanist);
    }
    @GetMapping("/read")
     public List<Botanist> read() {
        return botanistService.lire();
     }
    @PutMapping("/update/{id}")
     public Optional<Botanist> update(@PathVariable Integer id , @RequestBody Botanist botanist){
        return botanistService.modifier(id, botanist);
     }
     @DeleteMapping("/delete")
     public String delete(@PathVariable Integer id){
        return botanistService.supprimer(id);
     }
}
