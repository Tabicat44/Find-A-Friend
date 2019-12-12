package org.launchcode.service;

import org.launchcode.models.SeniorProperties;
import org.launchcode.models.data.SeniorPropertiesDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class UserService {

    @Autowired
    SeniorProperties seniorProperties;

    @Autowired
    SeniorPropertiesDao seniorPropertiesDao;
/*
    //    @Override
    public void doesSeniorPropertyAlreadyExist(SeniorProperties newSeniorProperties) {
        boolean doesSeniorPropertyAlreadyExist = false;
        SeniorProperties existingSeniorProperty = new SeniorProperties();
        SeniorPropertiesDao newSeniorPropertiesDao = new SeniorPropertiesDao() {

            @Override
            public SeniorProperties findByCompanyName(String companyName) {
                return null;
            }

            @Override
            public SeniorProperties findByEmail(String email) {
                return null;
            }

            @Override
            public <S extends SeniorProperties> S save(S entity) {
                return null;
            }

            @Override
            public <S extends SeniorProperties> Iterable<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public Optional<SeniorProperties> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public Iterable<SeniorProperties> findAll() {
                return null;
            }

            @Override
            public Iterable<SeniorProperties> findAllById(Iterable<Integer> integers) {
                return null;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(SeniorProperties entity) {

            }

            @Override
            public void deleteAll(Iterable<? extends SeniorProperties> entities) {

            }

            @Override
            public void deleteAll() {

            }
            *//*SeniorProperties existingSeniorProperty = SeniorPropertiesDao.findByEmail(newSeniorProperties.getEmail());*//*;
        };

    };*/
}