package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne(cascade = CascadeType.ALL)
    private User user;
    @ManyToOne(cascade = CascadeType.ALL)
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


    public Service(User user, PlantsList plantsList) {
        this.user = user;
        this.plantsList = plantsList;
    }

    public Set<Tracking> getTrackings() {
        return trackings;
    }

    public void setTrackings(Set<Tracking> trackings) {
        this.trackings = trackings;
    }

    public void ajouterTracking(Tracking tracking) {

        tracking.setService( this );
    }


}
