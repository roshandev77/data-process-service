package com.roshandev77.dataprocessservice.model;

import jakarta.persistence.*;
@Entity
public class IotData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(unique = true)
    private String uId;

    private String customerId;

//    @Enumerated(EnumType.STRING)
    private ConnectionStatus connStatus;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Location location;

    public IotData() {}

    public enum ConnectionStatus {
        CONNECTED ,
        DISCONNECTED
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


//    public IotData(String name, String uId, String connStatus, String customerId) {
//        this.name = name;
//        this.uId = uId;
//        this.connStatus = connStatus;
//    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public ConnectionStatus getConnStatus() {
        return connStatus;
    }

    public void setConnStatus(ConnectionStatus connStatus) {
        this.connStatus = connStatus;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}
