package org.launchcode.Controllers;

import org.launchcode.models.Inquiry1;
import org.launchcode.models.Inquiry2;
import org.launchcode.models.data.Inquiry1Dao;
import org.launchcode.models.data.Inquiry2Dao;
import org.launchcode.models.data.SeniorPropertiesDao;
import org.launchcode.models.SeniorProperties;
import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.context.annotation.Bean;
import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;*/
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Email;

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
    @GetMapping("")
    public String getRegistrationInfo(Model model) {
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

    @PostMapping("")
    public String letsPostRegistration(@ModelAttribute @Valid SeniorProperties newSeniorProperties,
                                       Errors errors, Model model, @RequestParam int inquiry1Id,
                                       @RequestParam int inquiry2Id) {
        boolean passwordsMatch = true;

        if (errors.hasErrors()) {
            passwordsMatch = false;
            newSeniorProperties.setPassword("");
            model.addAttribute("verifyError", "Passwords must match");
            model.addAttribute("testAddress", "Address must not be left blank");


            model.addAttribute("seniorProperty", newSeniorProperties);
            model.addAttribute("Question1", inquiry1Dao.findAll());
            model.addAttribute("Question2", inquiry2Dao.findAll());

            return "welcoming/seniors/register";
        }

//        if (!errors.hasErrors() && passwordsMatch) {
        model.addAttribute("title", "Woah!  Thank you so much for joining our community!");

        Inquiry1 theInquiry1 = inquiry1Dao.findById(inquiry1Id).orElse(null);
        Inquiry2 theInquiry2 = inquiry2Dao.findById(inquiry2Id).orElse(null);
        newSeniorProperties.setInquiry1(theInquiry1);
        newSeniorProperties.setInquiry2(theInquiry2);

        seniorPropertiesDao.save(newSeniorProperties);

        return "welcoming/seniors/joined";
    }

    @GetMapping("login")
    public String login(Model model) {
        model.addAttribute("title", "Welcome back!");
        model.addAttribute(new SeniorProperties());
/*        SeniorProperties aNewSeniorProperty = new SeniorProperties();
        model.addAttribute("user", aNewSeniorProperty);*/
        return ("welcoming/login");

    }


/*
    public String login(Errors errors,
                        Model model, @RequestParam String companyName,
                        @RequestParam String password, @ModelAttribute @Valid SeniorProperties newSeniorProperties) {
    */


    @PostMapping("login")
    public String login(Model model,
                        @ModelAttribute SeniorProperties  theSeniorProperties) {
//        if (errors.hasErrors()) {
//            model.addAttribute("title", "Welcome back!");
//            return "welcoming/login";
//        }

        SeniorProperties thatSeniorProperty = seniorPropertiesDao.findByUsername(theSeniorProperties.getUsername());

        if (thatSeniorProperty != null /*&& thisSeniorProperty != null*/) {
            if (thatSeniorProperty.getPassword().equals(theSeniorProperties.getPassword())) {
                return "redirect:/timeSlots";
            }
        }
        model.addAttribute("title", "Welcome back!");
        model.addAttribute(new SeniorProperties());
        return "welcoming/login";
    }
}


//        SeniorProperties thSeniorProperties = seniorPropertiesDao.findByCompanyName(username);
//        String password = form.getPassword();






















//        }
//        return "welcoming/seniors/register";


        /*Inquiries newInquiry = InquiryDao.findById(InquiryId).get();*/






/*
    ArrayList<Job> jobs = jobData.findByColumnAndValue(column, name);

        model.addAttribute("title", "Jobs with " + column.getName() + ": " + name);
                model.addAttribute("jobs", jobs);*/




//        model.addAttribute(newSeniorProperty);


//        if (theSeniorProperties.getPassword() == "" || theSeniorProperties.getVerifyPassword() == ""
//                || theSeniorProperties.getCompanyName() == "{null}"
//                || theSeniorProperties.getAddress() == ""
//                || theSeniorProperties.getEmail() == ""
//                || theSeniorProperties.getUsername() == ""
//                || theSeniorProperties.getZipCode() == ""
//                || !theSeniorProperties.getPassword().equals(verify)) {

//        if (seniorProperties.isUserAlreadyPresent(seniorProperties))

/*        if (seniorProperties.isUserAlreadyPresent(seniorProperties) == true) {
            model.addAttribute( "duplicateEmailError", "This email is already registered with an account");
        }*/

