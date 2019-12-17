package org.launchcode.models;


import org.launchcode.models.Inquiry1;
import org.launchcode.models.Inquiry2;
import org.launchcode.models.data.Inquiry1Dao;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class SeniorProperties {

    @Id
    @GeneratedValue
    private int seniorPropertiesId;

//    @OneToMany
//    @JoinColumn(name = "category_id")
//    private List<Cheese> cheeses = new ArrayList<>();

/*
    @OneToMany(mappedBy = "seniorProperties")
    private List<Inquiry1> inquiry1s = new ArrayList<>();

    @OneToMany(mappedBy = "seniorProperties")
    private List<Inquiry2> inquiry2s = new ArrayList<>();
*/
/*
    @OneToMany
    @JoinColumn(name= "seniorProperties_id")
    private List<Inquiry1> inquiry1s = new ArrayList<>();

    @OneToMany
    @JoinColumn(name= "seniorProperties_id")
    private List<Inquiry2> inquiry2s = new ArrayList<>();*/

/*    @OneToOne
    @JoinColumn(name= "Inquiry1Id")
    private List<Inquiry1> inquiry1s = new ArrayList<>();

    @OneToMany
    @JoinColumn(name= "Inquiry2Id")
    private List<Inquiry2> inquiry2s = new ArrayList<>();*/


    @ManyToOne
    private Inquiry1 inquiry1;

    @ManyToOne
    private Inquiry2 inquiry2;


    @NotBlank
    @Size(min=2, max=60)
    private String companyName;

    @Email
    @Size(message = "Invalid email address")
    private String email;

    @NotBlank
    @Size(min=1, max=40)
    private String username;

    @NotBlank
    @Size(min=3, max=22)
    private String password;

    @NotBlank
    @Size(min=3, max=22)
    private String verifyPassword;

    @NotNull
    @Size(min=8, message = "Sorry, address must be at least 8 characters long")
    private String address;

    @NotNull
    @Size(min=5, max=8)
    private String zipCode;

/*    private String pickedAnswer1;

    private String pickedAnswer2;*/

    //Empty Constructor
    public SeniorProperties() { }

    //Full constructor
    public SeniorProperties(String providedCompanyName, String email,
                            String providedUsername, String providedPassword,
                            String providedAddress, String providedZipCode
                            /*String thePickedAnswer1, String thePickedAnswer2*/){
        companyName = providedCompanyName;
        this.email = email;
        username = providedUsername;
        password = providedPassword;
        address = providedAddress;
        zipCode = providedZipCode;
/*        pickedAnswer1 = thePickedAnswer1;
        pickedAnswer2 = thePickedAnswer2;*/
    }

    public int getSeniorPropertiesId() { return seniorPropertiesId; }

    public String getCompanyName() { return companyName; }

    public void setCompanyName(String providedCompanyName) { companyName = providedCompanyName; }

    public String getEmail() { return email; }

    public void setEmail(String providedEmail) { email = providedEmail; }

    public String getUsername() { return username; }

    public void setUsername(String providedUsername) { username = providedUsername; }

    public String getPassword() { return password; }

    public void setPassword(String providedPassword) {
        password = providedPassword;
        checkPassword();
    }

    public String getVerifyPassword() { return verifyPassword; }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

    private void checkPassword() {
        if (password != "{null}" && verifyPassword != "{null}"
                && !password.equals(verifyPassword)) {
            verifyPassword = "{null}";
        }
    }

    public String getAddress() { return address; }

    public void setAddress(String providedAddress) { address = providedAddress; }

    public String getZipCode()  { return zipCode; }

    public void setZipCode(String providedZipCode) { zipCode = providedZipCode; }

/*
    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

    private void checkPassword() {
        if (password != null && verifyPassword != null
                && !password.equals(verifyPassword)) {
            verifyPassword = null;
        }
    }
*/



//    public String getPickedAnswer1() { return pickedAnswer1; }
//
//    public void setPickedAnswer1(String providedPickedAnswer1) { pickedAnswer1 = providedPickedAnswer1; }
//
//    public String getPickedAnswer2() { return pickedAnswer2; }
//
//    public void setPickedAnswer2(String providedPickedAnswer2) { pickedAnswer2 = providedPickedAnswer2; }

}