package com.roshandev77.dataprocessservice.daoimplementation;

import com.roshandev77.dataprocessservice.dao.CityGeoInfoDao;
import com.roshandev77.dataprocessservice.model.CityGeoInformation;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
public class CityGeoInfoDaoImple implements CityGeoInfoDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void save(CityGeoInformation cityGeoInformation) {
        entityManager.persist(cityGeoInformation);
    }
}
