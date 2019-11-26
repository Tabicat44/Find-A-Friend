package org.launchcode.models.forms;


import org.launchcode.models.data.SeniorPropertiesDao;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SeniorProperties {

    @Id
    @GeneratedValue
    private int id;
}
