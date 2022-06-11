package com.example.lab3.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class Car {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String mark;

    private String model;

    private Integer manufactureYear;

    private Boolean availability;

    private String pricePerDay;

    @OneToMany
    private List<CarRequest> carRequests;

    public Car() {
        this.carRequests = new ArrayList<>();
    }

    public Car(Long id, String mark, String model, Integer manufactureYear, Boolean availability, String pricePerDay, List<CarRequest> carRequests) {
        this.id = id;
        this.mark = mark;
        this.model = model;
        this.manufactureYear = manufactureYear;
        this.availability = availability;
        this.pricePerDay = pricePerDay;
        this.carRequests = carRequests;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getManufactureYear() {
        return manufactureYear;
    }

    public void setManufactureYear(Integer manufactureYear) {
        this.manufactureYear = manufactureYear;
    }

    public List<CarRequest> getCarRequests() {
        return carRequests;
    }

    public void setCarRequests(List<CarRequest> carRequests) {
        this.carRequests = carRequests;
    }

    public Boolean getAvailability() {
        return availability;
    }

    public void setAvailability(Boolean availability) {
        this.availability = availability;
    }

    public String getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(String pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
}
