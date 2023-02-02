package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class Advice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "TEXT")
    private String advice;

    @ManyToOne(cascade = CascadeType.ALL)
    private Tracking tracking;
    @ManyToOne(cascade = CascadeType.ALL)
    private Botanist botanist;



    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Advice() {
    }

    public Advice(String advice, Tracking tracking, Botanist botanist) {
        this.advice = advice;
        this.tracking = tracking;
        this.botanist = botanist;
    }
}
