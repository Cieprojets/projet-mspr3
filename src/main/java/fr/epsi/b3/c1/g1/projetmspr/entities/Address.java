package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;

import java.io.Serializable;

@Embeddable
public class Address implements Serializable {

    private Integer number;
    private String street;
    private String city;
    private Integer postcode;
    private Double latitude ;
    private Double longitude;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getPostcode() {
        return postcode;
    }

    public void setPostcode(Integer postcode) {
        this.postcode = postcode;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Address() {
    }

    public Address(Integer number, String street, String city, Integer postcode, Double latitude, Double longitude) {
        this.number = number;
        this.street = street;
        this.city = city;
        this.postcode = postcode;
        this.latitude = latitude;
        this.longitude = longitude;
    }
}
