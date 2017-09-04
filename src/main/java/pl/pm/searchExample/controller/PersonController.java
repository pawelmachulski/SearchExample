package pl.pm.searchExample.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import pl.pm.searchExample.dao.PersonDao;
import pl.pm.searchExample.model.Person;

import javax.websocket.server.PathParam;

@Controller
public class PersonController {

    @Autowired   // = wywołuje konstruktor PersonDaoImpl --> private PersonDao personDao = new PersonDaoImpl(); szuka klasy która implementuje interfejs i ma bina @Component
    private PersonDao personDao;

    @GetMapping("/")
    public String search(){
    return "search";
    }

    @GetMapping("/results")
    public String searchResult(@RequestParam String q, ModelMap modelMap){
        modelMap.addAttribute("people",personDao.findBySurname(q));
        return "results";
    }
}
