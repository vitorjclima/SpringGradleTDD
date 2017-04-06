package com.vitorlima.party.controller;

import com.vitorlima.party.model.Guest;
import com.vitorlima.party.repository.Guests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by vlima on 06/04/2017.
 */

@Controller
@RequestMapping(("/guests"))
public class GuestsController {

    @Autowired
    private Guests guests;

    @PostMapping
    public String save(Guest guest) {
        this.guests.save(guest);
        return "redirect:/guests";
    }

    @GetMapping
    public ModelAndView list(Guest guest) {
        ModelAndView mv = new ModelAndView("GuestList");
        mv.addObject("guest", guests.findAll());
        return mv;
    }

    public List<Guest> findAll(){
       return guests.findAll();
    }

    public Guest findById(Long id){
        return guests.findOne(id);
    }
}
