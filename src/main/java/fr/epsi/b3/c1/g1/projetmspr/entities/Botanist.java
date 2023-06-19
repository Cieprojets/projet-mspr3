package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Botanist implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numEmployee;
   //private String lastname;
    //private String firstname;

    @OneToMany(mappedBy = "botanist",cascade = CascadeType.ALL)
    private Set<Advice> advices;
    {
       advices = new HashSet<>();
    }

    @OneToOne(mappedBy = "botanist", cascade = CascadeType.ALL)
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "photoPlant_id")
    private Asset photoPlant;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public Botanist() {
    }

    public Botanist(Integer numEmployee, String lastname, String firstname) {
        this.numEmployee = numEmployee;
        //this.lastname = lastname;
        //this.firstname = firstname;

    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Botanist(Integer id, Integer numEmployee, String lastname, String firstname, Set<Advice> advices) {
        this.id = id;
        this.numEmployee = numEmployee;
        //this.lastname = lastname;
        //this.firstname = firstname;
        this.advices = advices;
    }

    public Integer getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(Integer numEmployee) {
        this.numEmployee = numEmployee;
    }

    /*public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
/*
  /*  public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

     */
}
