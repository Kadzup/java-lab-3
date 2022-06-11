package com.example.lab3.model;

import javax.persistence.*;

@Entity
@Table
public class EndAct {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Boolean damage;

    private String repairingPrice;

    @OneToOne
    private CarRequest carRequest;

    @ManyToOne
    private Admin admin;

    public EndAct() {
    }

    public EndAct(Long id, Boolean damage, String repairingPrice, CarRequest carRequest, Admin admin) {
        this.id = id;
        this.damage = damage;
        this.repairingPrice = repairingPrice;
        this.carRequest = carRequest;
        this.admin = admin;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getDamage() {
        return damage;
    }

    public void setDamage(Boolean damage) {
        this.damage = damage;
    }

    public String getRepairingPrice() {
        return repairingPrice;
    }

    public void setRepairingPrice(String repairingPrice) {
        this.repairingPrice = repairingPrice;
    }

    public CarRequest getCarRequest() {
        return carRequest;
    }

    public void setCarRequest(CarRequest carRequest) {
        this.carRequest = carRequest;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }
}
