package com.roshandev77.dataprocessservice.controller;

import com.roshandev77.dataprocessservice.dao.CityGeoInfoDao;
import com.roshandev77.dataprocessservice.model.CityGeoInformation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api1")
public class CityGeoInfoController {

    private CityGeoInfoDao cityGeoInfoDao;

    public CityGeoInfoController(CityGeoInfoDao cityGeoInfoDao) {
        this.cityGeoInfoDao = cityGeoInfoDao;
    }

    @PostMapping("/city-info")
    public ResponseEntity<Void> saveCityGeoInfo(@RequestBody CityGeoInformation cityGeoInformation) {
        System.out.println("Here inside save city insideeee");
        System.out.println(cityGeoInformation.getCityName() + " " + cityGeoInformation.getWeather());
        cityGeoInfoDao.save(cityGeoInformation);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

//    @GetMapping("/get-max-temp")
//    public ResponseEntity<Void> getMaxTemp(@RequestBody )
}
