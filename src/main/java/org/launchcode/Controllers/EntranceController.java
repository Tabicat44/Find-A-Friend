package org.launchcode.Controllers;

import org.launchcode.models.SeniorProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping(value="")
public class EntranceController {

    @RequestMapping(value="hiThere")
    public String entrance(Model model){ return "welcoming/entrance"; }

    @RequestMapping(value="option1")
    public String pick1Seniors(Model model){ return "welcoming/seniors/option2";}

    @RequestMapping(value="option2")
    public String pick1Volunteers(Model model){ return "welcoming/volunteers/option2"; }

    // I don't need this code b/c I have the call to return the page
    //in the SeniorsPropertiesController file
/*    @RequestMapping(value="seniorsRegisterLink")
    public String seniorsRegister(Model model){ return "welcoming/seniors/register"; }*/

/*    @RequestMapping(value="seniorsLogin")
    public String seniorsLogin(Model model){ return "welcoming/seniors/login"; }*/


/*    @RequestMapping("login")
    public String loggingIn(Model model){
        model.addAttribute(new SeniorProperties());

        return ("welcoming/login");

    }*/
}

/*





    @RequestMapping(value = "view/{theMenuId}", method = RequestMethod.GET)
    public String viewMenu(Model model, @PathVariable int theMenuId){
        Menu aNewMenu = menuDao.findById(theMenuId).get();

        model.addAttribute("menu", aNewMenu);
        model.addAttribute("title", aNewMenu.getName());


       model.addAttribute("title", aNewMenu.getTheMenuName());
        model.addAttribute("cheeses", aNewMenu.getCheeses());
        model.addAttribute("menuId", aNewMenu.getId());


        model.addAttribute(menuDao.findById(theMenuId));
        return "menu/view";
    }*/
