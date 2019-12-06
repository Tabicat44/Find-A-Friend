package org.launchcode.Controllers;

import org.launchcode.models.data.Inquiry1Dao;
import org.launchcode.models.data.Inquiry2Dao;
import org.launchcode.models.data.SeniorPropertiesDao;
import org.launchcode.models.SeniorProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value="register")
public class SeniorPropertiesController {

    @Autowired
    private SeniorPropertiesDao seniorPropertiesDao;

    @Autowired
    private Inquiry1Dao inquiry1Dao;

    @Autowired
    private Inquiry2Dao inquiry2Dao;


    //This is the form for Senior Citizen companies to register
    @RequestMapping(value="", method = RequestMethod.GET)
    public String getRegistrationInfo(Model model){
        model.addAttribute("title", "Let's Get You an Account");
        SeniorProperties newSeniorProperty = new SeniorProperties();
        model.addAttribute("seniorProperty", newSeniorProperty);
        model.addAttribute("Question1", inquiry1Dao.findAll());
        model.addAttribute("Question2", inquiry2Dao.findAll());
//        model.addAttribute("Senior Properties", new SeniorProperties());
//        model.addAttribute(new SeniorProperties());
/*        model.addAttribute("theSeniorProperty", SeniorProperties);*/

        return "welcoming/seniors/register";

    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String letsPostRegistration(@ModelAttribute @Valid SeniorProperties seniorProperties,
                                       Errors errors, Model model) {

//        model.addAttribute(newSeniorProperty);
        boolean passwordsMatch = true;
//        if (theSeniorProperties.getPassword() == "" || theSeniorProperties.getVerifyPassword() == ""
//                || theSeniorProperties.getCompanyName() == ""
//                || theSeniorProperties.getAddress() == ""
//                || theSeniorProperties.getEmail() == ""
//                || theSeniorProperties.getUsername() == ""
//                || theSeniorProperties.getZipCode() == ""
//                || !theSeniorProperties.getPassword().equals(verify)) {
        if (errors.hasErrors()){
            passwordsMatch = false;
            seniorProperties.setPassword("");
            model.addAttribute("verifyError", "Passwords must match");
            model.addAttribute("testAddress", "Address must not be left blank");


            model.addAttribute("seniorProperty", seniorProperties);
            model.addAttribute("Question1", inquiry1Dao.findAll());
            model.addAttribute("Question2", inquiry2Dao.findAll());

            return "welcoming/seniors/register";
        }


//        if (!errors.hasErrors() && passwordsMatch) {
        model.addAttribute("title", "Woah!  Thank you so much for joining our community!");

        seniorPropertiesDao.save(seniorProperties);

            return "welcoming/seniors/joined";
//        }
//        return "welcoming/seniors/register";
    }


        /*Inquiries newInquiry = InquiryDao.findById(InquiryId).get();*/

}

