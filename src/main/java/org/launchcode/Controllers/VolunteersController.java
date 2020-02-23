package org.launchcode.Controllers;


import org.launchcode.models.data.Inquiry2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value="VolunteerRegistration")
public class VolunteersController {

    @Autowired Inquiry2Dao inquiry2Dao;
}
