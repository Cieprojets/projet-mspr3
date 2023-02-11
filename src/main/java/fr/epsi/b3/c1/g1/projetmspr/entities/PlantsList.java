package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class PlantsList implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String spicies;
    @Column(columnDefinition = "TEXT")
    private String description;


    private String picture;

    @OneToMany(mappedBy = "plantsList",cascade = CascadeType.ALL)
    private Set<Service> services;
    {
        services = new HashSet<>();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public PlantsList() {
    }

    public PlantsList(String spicies, String description, String picture) {

        this.spicies = spicies;
        this.description = description;
        this.picture = picture;

    }

    public PlantsList(String spicies, String description, String picture, Set<Service> services) {
        this.spicies = spicies;
        this.description = description;
        this.picture = picture;
        this.services = services;
    }

    public String getSpicies() {
        return spicies;
    }

    public void setSpicies(String spicies) {
        this.spicies = spicies;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


}
