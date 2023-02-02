package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Tracking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pictureTrack;
    private LocalDateTime date;

    @ManyToOne(cascade = CascadeType.ALL)
    private Service service;

    @OneToMany(mappedBy = "tracking",cascade = CascadeType.ALL)
    private Set<Advice> advices;
    {
        advices = new HashSet<>();
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Tracking() {
    }



    public Tracking(String pictureTrack, LocalDateTime date) {
        this.pictureTrack = pictureTrack;
        this.date = date;

    }

    public String getPictureTrack() {
        return pictureTrack;
    }

    public void setPictureTrack(String pictureTrack) {
        this.pictureTrack = pictureTrack;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }


    public void setService( Service service ) {
        if (this.service != null) {
            this.service.getTrackings().remove( this );
        }

        this.service = service;

        if (this.service != null) {
            this.service.getTrackings().add( this );
        }
    }
}
