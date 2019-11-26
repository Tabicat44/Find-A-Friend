package org.launchcode.models.forms;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class TimeSlots {


    @Id
    @GeneratedValue
    private int id;

    public TimeSlots () {

    }
}
