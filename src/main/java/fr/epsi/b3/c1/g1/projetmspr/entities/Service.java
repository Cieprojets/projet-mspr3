package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Service {
    @Id
    private Integer id;

    @ManyToOne
    private User user;
    @ManyToOne
    private PlantsList plantsList;

    @OneToMany(mappedBy = "service",cascade = CascadeType.ALL)
    private Set<Tracking> trackings;

    {
        trackings = new HashSet<>();
    }


    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Service() {
    }
}
