package org.launchcode.models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
public class Inquiry2 {

    @Id
    @GeneratedValue
    private int id;

    @ManyToMany
    private List<SeniorProperties> seniorProperties;

    @NotBlank
    @Size(min=2, max=45)
    private String theAnswer2;

    public Inquiry2() { }


    public int getId() { return id; }

    public String getTheAnswer2() { return theAnswer2; }

    public void setTheAnswer2(String providedTheAnswer2) { theAnswer2 = providedTheAnswer2; }
}
