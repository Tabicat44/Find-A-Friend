package org.launchcode.models.data;


import org.launchcode.models.forms.Volunteers;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional

public interface VolunteersDao extends CrudRepository<Volunteers, Integer> {
    //Might need to add forced methods here. See SeniorProperties for examples
}
