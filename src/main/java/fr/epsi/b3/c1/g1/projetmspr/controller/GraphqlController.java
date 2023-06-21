package fr.epsi.b3.c1.g1.projetmspr.controller;

import fr.epsi.b3.c1.g1.projetmspr.entities.Botanist;
import fr.epsi.b3.c1.g1.projetmspr.entities.Ser;
import fr.epsi.b3.c1.g1.projetmspr.service.BotanistService;
import fr.epsi.b3.c1.g1.projetmspr.service.SerService;
import lombok.AllArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
@AllArgsConstructor
public class GraphqlController {
    private SerService serService;
    private BotanistService botanistService;


    @QueryMapping
    public Ser serById(@Argument int id) {
        return serService.findById(id);
    }

    @SchemaMapping(typeName = "Query", value = "allSer")
    public List<Ser> getAllSer() {
        return serService.lecture();
    }

    @QueryMapping
    public Optional<Botanist> botanistById(@Argument int id) {
        return botanistService.findById(id);
    }

    @QueryMapping
    public List<Botanist> allBotanist() {
        return botanistService.lire();
    }
}
