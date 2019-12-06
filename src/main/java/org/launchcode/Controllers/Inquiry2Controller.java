package org.launchcode.Controllers;


import org.launchcode.models.Inquiry2;
import org.launchcode.models.data.Inquiry2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.validation.Errors;

import javax.validation.Valid;

@Controller
@RequestMapping(value="addAnswer2")
public class Inquiry2Controller {

    @Autowired
    private Inquiry2Dao inquiry2Dao;

    @RequestMapping(value="", method = RequestMethod.GET)
    public String addAnswer2(Model model){
        model.addAttribute("Question2", "Second Question");
        model.addAttribute("inquiry2", new Inquiry2());

        return "questions/addAnswer2";

    }

    @RequestMapping(value="", method = RequestMethod.POST)
    public String addAnswer2(Model model, @ModelAttribute @Valid Inquiry2 inquiry2,
                             Errors errors){

        if (errors.hasErrors()){
            return "questions/addAnswer2";
        }

        model.addAttribute("title", "Answer Successfully added to question");
        inquiry2Dao.save(inquiry2);
        return "questions/newAnswerAdded";

    }


}
