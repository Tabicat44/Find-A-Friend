package org.launchcode.models.forms;


import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.concurrent.atomic.DoubleAccumulator;

@Entity
public class Volunteers {

    @Id
    @GeneratedValue
    private int volunteerId;

/*    @OneToOne
    @JoinColumn volunteer*/

    @NotBlank
    @Size(min=2, max=60)
    private String firstName;

    @NotBlank
    @Size(min=2, max=60)
    private String lastName;

    @NotBlank
    @Size(min=1, max=40)
    private String username;

    @NotBlank
    @Size(min=3, max=22)
    private String password;

    @NotBlank
    @Size
    private int rating;


    //Empty Constructor
    public Volunteers() {};

    //Full Constructor

    public Volunteers(String firstName, String providedLastName,
                      String givenUsername, String givenPassword,
                      int providedRating){
        this.firstName = firstName;
        lastName = providedLastName;
        username = givenUsername;
        password = givenPassword;
        rating = providedRating;

    }

    //Getters and Setters of the attributes of the Volunteers object
    public int getVolunteerId() { return volunteerId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String providedFirstName) { firstName = providedFirstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String providedLastName) { lastName = providedLastName; }

    public  String getUsername() { return username; }
    public void setUsername(String providedUsername) { username = providedUsername; }

    public String getPassword() { return password; }
    public void setPassword(String providedPassword) { password = providedPassword; }

    public int getRating() { return rating; }
    public void setRating(int providedRating) { rating = providedRating; }
}
