package com.roshandev77.dataprocessservice.controller;

import com.fasterxml.jackson.databind.JsonNode;
import com.roshandev77.dataprocessservice.dao.IotDataDao;
import com.roshandev77.dataprocessservice.model.IotData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sound.midi.Soundbank;

@RestController
@RequestMapping("/api")
public class IotDataController {

    private final IotDataDao iotDataDao;

    IotDataController(IotDataDao iotDataDao) {
        this.iotDataDao = iotDataDao;
    }

    @PostMapping
    public ResponseEntity<Void> saveIotData(@RequestBody IotData iotData) {
        System.out.println("Inside saveIotData" + iotData.getName());
        iotDataDao.save(iotData);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
