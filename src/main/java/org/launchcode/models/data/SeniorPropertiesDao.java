package org.launchcode.models.data;


import org.launchcode.models.SeniorProperties;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;


@Repository
@Transactional
@Component
public interface SeniorPropertiesDao extends CrudRepository<SeniorProperties, Integer> {

    SeniorProperties findByCompanyName(String companyName);
    SeniorProperties findByEmail(String email);

}