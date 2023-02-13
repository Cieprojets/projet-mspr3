package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Ser implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @ManyToOne(cascade = CascadeType.ALL)
    private User gardien;
    @ManyToOne(cascade = CascadeType.ALL)
    private PlantsList plantsList;

    @OneToMany(mappedBy = "ser",cascade = CascadeType.ALL)
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

    public Ser() {
    }


    public Ser(User user, PlantsList plantsList) {
        this.user = user;
        this.plantsList = plantsList;
    }

    public Ser(User user, User gardien, PlantsList plantsList) {
        this.user = user;
        this.gardien = gardien;
        this.plantsList = plantsList;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getGardien() {
        return gardien;
    }

    public void setGardien(User gardien) {
        this.gardien = gardien;
    }

    public PlantsList getPlantsList() {
        return plantsList;
    }

    public void setPlantsList(PlantsList plantsList) {
        this.plantsList = plantsList;
    }

    /*public Set<Tracking> getTrackings() {
        return trackings;
    }

    public void setTrackings(Set<Tracking> trackings) {
        this.trackings = trackings;
    }

    public void ajouterTracking(Tracking tracking) {

        tracking.setService( this );
    }
*/

}
