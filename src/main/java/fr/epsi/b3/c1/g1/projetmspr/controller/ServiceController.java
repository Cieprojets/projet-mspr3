package fr.epsi.b3.c1.g1.projetmspr.controller;

import fr.epsi.b3.c1.g1.projetmspr.entities.Ser;
import fr.epsi.b3.c1.g1.projetmspr.service.SerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/service")
@AllArgsConstructor
public class ServiceController {
    private final SerService serService;
    @PostMapping("/create")
    public Ser create(@RequestBody Ser ser){
        return serService.ajouter(ser);
    }

    @GetMapping("/read")
    public List<Ser> read() {
        return serService.lecture();
    }

    @PutMapping("/update/{id}")
    public Ser update(@PathVariable Integer id , @RequestBody Ser ser){
        return serService.modifie(id, ser);

    }
    @DeleteMapping("/delete")
    public String delete(@PathVariable Integer id){
        return serService.supprime(id);
    }


}
