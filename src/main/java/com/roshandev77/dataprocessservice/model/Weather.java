package com.roshandev77.dataprocessservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Weather {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String main;

    private String des;

//    Used lombok instead of defining each getter and setter

//    public Weather() {};
//
//    public void setMain(String main) {
//        this.main = main;
//    }
//
//    public void setDes(String des) {
//        this.des = des;
//    }
//
//    public String getMain() {
//        return main;
//    }
//
//    public String getDes() {
//        return des;
//    }
}
