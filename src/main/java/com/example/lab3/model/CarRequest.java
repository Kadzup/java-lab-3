package com.example.lab3.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table
public class CarRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date startDate;

    private Date endDate;

    private Boolean isPayed;

    private Boolean approved;

    @ManyToOne
    private Car car;

    @OneToOne
    private EndAct endAct;

    @ManyToOne
    private Client client;

    public CarRequest(Long id, Date startDate, Date endDate, Boolean isPayed, Boolean approved, Car car, EndAct endAct, Client client) {
        this.id = id;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isPayed = isPayed;
        this.approved = approved;
        this.car = car;
        this.endAct = endAct;
        this.client = client;
    }

    public CarRequest(Date startDate, Date endDate, Boolean isPayed, Boolean approved, Car car, EndAct endAct, Client client) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.isPayed = isPayed;
        this.approved = approved;
        this.car = car;
        this.endAct = endAct;
        this.client = client;
    }

    public CarRequest() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Boolean getPayed() {
        return isPayed;
    }

    public void setPayed(Boolean payed) {
        isPayed = payed;
    }

    public EndAct getEndAct() {
        return endAct;
    }

    public void setEndAct(EndAct endAct) {
        this.endAct = endAct;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Boolean getApproved() {
        return approved;
    }

    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
}
