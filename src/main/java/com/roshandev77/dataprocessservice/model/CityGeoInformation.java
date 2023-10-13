package com.roshandev77.dataprocessservice.model;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import java.util.Date;

@Entity
@Data
public class CityGeoInformation {

    @Id
    @GeneratedValue(generator = "alphanumeric-id")
    @GenericGenerator(name = "alphanumeric-id", strategy = "com.roshandev77.dataprocessservice.customlib")
    @Column(name = "alphanumeric_id", unique = true, nullable = false, length = 12) // Adjust length as needed
    private String alphanumericId;

    private String cityName = "";

    private String timestamp;

    private double longitude;

    private double latitude;

//    Removed the getter setter and used @Data instead from Lombok

//    public String getTimestamp() {
//        return timestamp;
//    }
//
//    public void setTimestamp(String timestamp) {
//        this.timestamp = timestamp;
//    }
//
//    public double getLongitude() {
//        return longitude;
//    }
//
//    public void setLongitude(double longitude) {
//        this.longitude = longitude;
//    }
//
//    public double getLatitude() {
//        return latitude;
//    }
//
//    public void setLatitude(double latitude) {
//        this.latitude = latitude;
//    }

//    @OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "coordinates_id")
//    private Coordinates coordinates;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "weather_id")
    private Weather weather;

//    public String getCityName() {
//        return cityName;
//    }
//
//    public void setCityName(String cityName) {
//        this.cityName = cityName;
//    }

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "temp_info_id")
    private TempInformation tempInformation;

//    public CityGeoInformation(){};

//    public String getName() {
//        return cityName;
//    }
//
//    public void setName(String cityName) {
//        this.cityName = cityName;
//    }

//    public Coordinates getCoordinates() {
//        return coordinates;
//    }
//
//    public void setCoordinates(Coordinates coordinates) {
//        this.coordinates = coordinates;
//    }

//    public Weather getWeather() {
//        return weather;
//    }
//
//    public void setWeather(Weather weather) {
//        this.weather = weather;
//    }
//
//    public TempInformation getTempInformation() {
//        return tempInformation;
//    }
//
//    public void setTempInformation(TempInformation tempInformation) {
//        this.tempInformation = tempInformation;
//    }
}
