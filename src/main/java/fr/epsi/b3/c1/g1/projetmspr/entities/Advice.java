package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

@Entity
public class Advice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String advice;

    @ManyToOne
    private Tracking tracking;
    @ManyToOne
    private Botanist botanist;



    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Advice() {
    }




}
