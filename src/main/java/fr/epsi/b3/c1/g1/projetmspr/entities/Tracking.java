package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Set;

@Entity
public class Tracking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String pictureTrack;
    private LocalDateTime date;


    @ManyToOne
    private PlantsList plantsList;




    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Tracking() {
    }

    public Tracking(String pictureTrack, LocalDateTime date, PlantsList plantsList) {
        this.pictureTrack = pictureTrack;
        this.date = date;
        this.plantsList = plantsList;
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

    public PlantsList getPlantsList() {
        return plantsList;
    }

    public void setPlantsList(PlantsList plantsList) {
        this.plantsList = plantsList;
    }
}
