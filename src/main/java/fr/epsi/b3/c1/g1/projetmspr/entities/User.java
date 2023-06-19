package fr.epsi.b3.c1.g1.projetmspr.entities;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String firstname;
    private String lastname;
    private String email;
    private String password;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private Set<Ser> sers;
    {
       sers = new HashSet<>();
    }

    @OneToMany(mappedBy = "gardien",cascade = CascadeType.ALL)
    private Set<Ser> servicesses;
    {
        servicesses = new HashSet<>();
    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private Botanist botanist;


     @Embedded
     private Address address;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }



    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    public User() {
    }
    public Botanist getBotanist() {
        return botanist;
    }

    public void setBotanist(Botanist botanist) {
        this.botanist = botanist;
    }

    public User(String firstname, String lastname, String email, String password, Set<Ser> sers, Set<Ser> servicesses, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.sers = sers;
        this.servicesses = servicesses;
        this.address = address;
    }

    public User(Set<Ser> sers, Set<Ser> servicesses) {
        this.sers = sers;
        this.servicesses = servicesses;
    }

    public User(String firstname, String lastname, String email, String password, Address address) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.password = password;
        this.address = address;
    }

}
