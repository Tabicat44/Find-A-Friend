package org.launchcode.Controllers;

import org.launchcode.models.Inquiry1;
import org.launchcode.models.Inquiry2;
import org.launchcode.models.data.Inquiry1Dao;
import org.launchcode.models.data.Inquiry2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping(value="addAnswer1")
public class Inquiry1Controller {

    @Autowired
    private Inquiry1Dao inquiry1Dao;


    @RequestMapping(value="", method = RequestMethod.GET)
    public String addAnswer1(Model model){
        model.addAttribute("title", "Add Answers");
        model.addAttribute("inquiry1", new Inquiry1());
        /*model.addAttribute("inquiry2", new Inquiry2());*/

        return "questions/addAnswer1";
    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String addAnswer1(Model model, @ModelAttribute @Valid Inquiry1 inquiry1,
                             Errors errors){
        if (errors.hasErrors()){
            return "questions/addAnswer1";
        }

        model.addAttribute("title", "Answer Successfully added to question");
        model.addAttribute("inquiry", inquiry1);
        inquiry1Dao.save(inquiry1);
       /* inquiry2Dao.save(inquiry2);*/

        return "questions/newAnswerAdded";
    }

}