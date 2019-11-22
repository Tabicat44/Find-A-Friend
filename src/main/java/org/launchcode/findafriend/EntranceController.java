package org.launchcode.findafriend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.RequestScope;

@Controller
@RequestMapping("Entrance")
public class EntranceController {


    @RequestMapping(value="Entrance")
    public String index(Model model){
        model.addAttribute("option1",
                "Senior Representative");
        model.addAttribute("option1",
                "Volunteer");

        return "entrance";
    }

}