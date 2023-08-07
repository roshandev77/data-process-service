package com.roshandev77.dataprocessservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IotData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private String uId;

    public IotData(String name, String uId) {
        this.name = name;
        this.uId = uId;
    }

    public IotData() {

    }

    public String getName() {
        return this.name;
    }


}
