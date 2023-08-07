package com.roshandev77.dataprocessservice.daoimplementation;

import com.roshandev77.dataprocessservice.dao.IotDataDao;
import com.roshandev77.dataprocessservice.model.IotData;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class IotDataDaoImple implements IotDataDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    @Override
    public void save(IotData iotData) {
        entityManager.persist(iotData);
    }
}
