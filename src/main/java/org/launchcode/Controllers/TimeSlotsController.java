package org.launchcode.Controllers;

import org.launchcode.models.data.TimeSlotsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;







@Controller
@RequestMapping(value = "TimeSlots")
public class TimeSlotsController {

    @Autowired
    private TimeSlotsDao timeSlotDao;

    @RequestMapping(value = "")
    public String index(Model model){
        return "times/index";
    }
}
