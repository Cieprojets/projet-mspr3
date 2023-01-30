package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.util.Set;

@Entity
public class Botanist {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer numEmployee;
    private String lastname;
    private String firstname;

    @OneToMany(mappedBy = "botanists",cascade = CascadeType.ALL)
    private Set<Advice> advices;

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
        this.lastname = lastname;
        this.firstname = firstname;
    }

    public Integer getNumEmployee() {
        return numEmployee;
    }

    public void setNumEmployee(Integer numEmployee) {
        this.numEmployee = numEmployee;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
