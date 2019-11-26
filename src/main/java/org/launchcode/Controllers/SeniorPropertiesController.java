package org.launchcode.Controllers;

import org.launchcode.models.data.SeniorPropertiesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="register")
public class SeniorPropertiesController {

    @Autowired
    private SeniorPropertiesDao seniorProperties;



    //This is the form for them to register
    @RequestMapping(value="", method = RequestMethod.GET)
    public void getRegisterationInfo(Model model){
    }
}


