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
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "photo_id")
    private Asset picture_track;

    private LocalDateTime date;

    @ManyToOne(cascade = CascadeType.ALL)
    private Ser ser;

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



    public Tracking(Asset photo, LocalDateTime date) {
        this.picture_track = photo;
        this.date = date;

    }

    public Asset getPhoto() {
        return picture_track;
    }

    public void setPhoto(Asset photo) {
        this.picture_track = photo;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Tracking(Asset photo, LocalDateTime date, Ser ser, Set<Advice> advices) {
        this.picture_track = photo;
        this.date = date;
        this.ser = ser;
        this.advices = advices;
    }

    public Ser getService() {
        return ser;
    }

    public Set<Advice> getAdvices() {
        return advices;
    }

    public void setAdvices(Set<Advice> advices) {
        this.advices = advices;
    }
/*
    public void setService(Ser ser) {
        if (this.ser != null) {
            this.ser.getTrackings().remove( this );
        }

        this.ser = ser;

        if (this.ser != null) {
            this.ser.getTrackings().add( this );
        }
    }

 */
}
