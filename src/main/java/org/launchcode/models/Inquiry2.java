package org.launchcode.models;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Inquiry2 {

    @Id
    @GeneratedValue
    private int inquiry2Id;

/*    @ManyToMany
    @JoinColumn(name = "SeniorProperties_id")
    private List<SeniorProperties> seniorProperties;*/

/*    @ManyToOne
    private SeniorProperties seniorProperties;*/
/*
    @ManyToOne
    private SeniorProperties seniorProperties;*/

    @OneToMany
    @JoinColumn(name= "inquiry2Id")
    private List<SeniorProperties> seniorProperties = new ArrayList<>();

    @NotBlank
    @Size(min=2, max=45)
    private String theAnswer2;

    public Inquiry2() { }

/*    public SeniorProperties seniorProperties() { return seniorProperties; }

    public void setSeniorProperties(SeniorProperties seniorProperties) { this.seniorProperties = seniorProperties; }*/


    public List<SeniorProperties> getTheSeniorProperties() { return seniorProperties; }

    public void setTheSeniorProperties(List<SeniorProperties> theSeniorProperties) { this.seniorProperties = theSeniorProperties; }

    public int getInquiry2Id() { return inquiry2Id; }

    public String getTheAnswer2() { return theAnswer2; }

    public void setTheAnswer2(String providedTheAnswer2) { theAnswer2 = providedTheAnswer2; }
}
