package com.example.lab3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private String surname;

    private String passport;

    @OneToMany
    private List<CarRequest> carRequests;

    public Client() {
        this.carRequests = new ArrayList<>();
    }

    public Client(Long id, String name, String surname, String passport, List<CarRequest> carRequests) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.passport = passport;
        this.carRequests = carRequests;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public List<CarRequest> getCarRequests() {
        return carRequests;
    }

    public void setCarRequests(List<CarRequest> carRequests) {
        this.carRequests = carRequests;
    }
}
