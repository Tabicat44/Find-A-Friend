package org.launchcode.models.forms;


import org.launchcode.models.Inquiry1;
import org.launchcode.models.Inquiry2;
import org.launchcode.models.SeniorProperties;

public class theComboForm {


    private SeniorProperties seniorProperties;
    private Iterable<Inquiry1> inquiry1s;
    private Iterable<Inquiry2> inquiry2s;


    public theComboForm() { }

    public theComboForm(SeniorProperties newSeniorProperties,
                        Iterable inquiry1s, Iterable inquiry2s){
        seniorProperties = newSeniorProperties;
        this.inquiry1s = inquiry1s;
        this.inquiry2s = inquiry2s;
    }


    public void setSeniorProperties(SeniorProperties seniorProperties) {
        this.seniorProperties = seniorProperties;
    }

    public int getSeniorPropertiesId() { return getSeniorPropertiesId(); }


    public void setInquiry1s(Iterable<Inquiry1> inquiry1s) { this.inquiry1s = inquiry1s; }

    public Iterable getInquiry1s() { return inquiry1s; }

    public int getInquiry1Id() { return getInquiry1Id(); }

    public void setInquiry2s(Iterable<Inquiry2> inquiry2s) { this.inquiry2s = inquiry2s; }

    public Iterable getInquiry2s() { return inquiry2s; }

    public Iterable getInquiry2Id() { return getInquiry2Id(); }


}