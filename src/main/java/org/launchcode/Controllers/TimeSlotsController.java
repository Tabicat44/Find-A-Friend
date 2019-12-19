package org.launchcode.Controllers;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.hibernate.validator.constraints.ModCheck;
import org.launchcode.models.TimeSlots;
import org.launchcode.models.data.TimeSlotsDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import sun.java2d.pipe.SpanShapeRenderer;

import javax.validation.Valid;
import java.text.SimpleDateFormat;


@Controller
public class TimeSlotsController {

    @Autowired
    private TimeSlotsDao timeSlotsDao;

    //View that lists available time slots, and let's users
    //go to the page where they can add new time slots
    @RequestMapping(value = "timeSlots")
    public String index(Model model) {
        model.addAttribute("title", "Available Appointment Times:");
        model.addAttribute("timeSlots", timeSlotsDao.findAll());

        return "times/index";
    }

    //Puts up form for users to add time slots
    @GetMapping("addTimeSlots")
    public String getThoseTimes(Model model){
//        model.addAttribute("title", "Schedule Appointment Times");
//        TimeSlots timeSlots = new TimeSlots();
//        model.addAttribute("puppy", timeSlots);
        model.addAttribute("title", "Please choose a time and date:");
        model.addAttribute("thoseTimeSlotsTho", new TimeSlots());

        return "times/add";
    }


    //Collects information from form that adds time slots
    @PostMapping("addTimeSlots")
    public String getThoseTimes(Model model, @ModelAttribute @Valid TimeSlots newTimeSlots){

        timeSlotsDao.save(newTimeSlots);
        return "redirect:timeSlots";

    }
















/*    @InitBinder
    private void dateBinder(WebDataBinder binder){
        SimpleDateFormat dateFormat = new simpleDateFormat("dd-MM-yyyy");
        //Create a new CustomDatEditor
        CustomDateEditor editor =  new CustomDateEditor(dateFormat, true);
        //Register it as a custom editor for the Data type
        binder.registerCustomEditor(Date.class, editor);
    }*/




}
