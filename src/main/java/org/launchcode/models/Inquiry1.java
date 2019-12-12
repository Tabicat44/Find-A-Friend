package org.launchcode.models;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Inquiry1 {

    @Id
    @GeneratedValue
    private int inquiry1Id;
/*
    @ManyToMany
    @JoinColumn(name = "SeniorProperties_id")
    private List<SeniorProperties> seniorProperties;
    // OR private SeniorProperties seniorProperties;*/


/*    @ManyToOne
    private SeniorProperties seniorProperties;
    // OR private SeniorProperties seniorProperties;*/
    @OneToMany
    @JoinColumn(name= "inquiry1Id")
    private List<SeniorProperties> theSeniorProperties = new ArrayList<>();


    @NotNull
    @Size(min=2, max=45)
    private String theAnswer1;


    public Inquiry1() { }

/*    public SeniorProperties seniorProperties() { return seniorProperties; }

    public void setSeniorProperties(SeniorProperties seniorProperties) { this.seniorProperties = seniorProperties; }*/

    public List<SeniorProperties> getTheSeniorProperties() { return theSeniorProperties; }

    public void setTheSeniorProperties(List<SeniorProperties> theSeniorProperties) { this.theSeniorProperties = theSeniorProperties; }

    public int getInquiry1Id() { return inquiry1Id; }

    public String getTheAnswer1() { return theAnswer1; }

    public void setTheAnswer1(String providedAnswerOption) { theAnswer1 = providedAnswerOption; }

}

