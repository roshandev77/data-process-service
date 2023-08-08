package com.roshandev77.dataprocessservice.controller;

import com.roshandev77.dataprocessservice.dao.IotDataDao;
import com.roshandev77.dataprocessservice.model.IotData;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;
import static org.mockito.Mockito.verify;

public class IotDataControllerTest {

    @Mock
    private IotDataDao iotDataDao;

    private IotDataController iotDataController;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        iotDataController = new IotDataController(iotDataDao);
    }

    @Test
    public void testSaveIotData() {
        IotData iotData = new IotData();

        ResponseEntity<Void> responseEntity = iotDataController.saveIotData(iotData);

        verify(iotDataDao).save(iotData);
    }
}
