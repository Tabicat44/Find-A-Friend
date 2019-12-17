package org.launchcode.models;

import org.springframework.context.annotation.ComponentScan;

import javax.persistence.*;
/*import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;*/
import javax.validation.constraints.NotBlank;

@Entity
public class TimeSlots {

    @Id
    @GeneratedValue
    private int timeSlotsId;


//    @DateTimeFormat

    @NotBlank
    private String date;

    @NotBlank
    private String time;

    public TimeSlots () { }

    public TimeSlots(String pickedTime, String pickedDate){
        time = pickedTime;
        date = pickedDate;
    }

    public int getTimeSlotsId() { return timeSlotsId; }

    public String getTime() { return time; }

    public void setTime(String providedTime) { time = providedTime; }

    public String getDate() { return date; }

    public void setDate(String providedDate) { date = providedDate; }




}
