package org.launchcode.models;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Inquiry1 {

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    @JoinColumn(name = "SeniorProperties_id")
    private List<SeniorProperties> seniorProperties;

    @NotNull
    @Size(min=2, max=45)
    private String theAnswer1;


    public Inquiry1() { }


    public int getId() { return id; }

    public String getTheAnswer1() { return theAnswer1; }

    public void setTheAnswer1(String providedAnswerOption) { theAnswer1 = providedAnswerOption; }

}

