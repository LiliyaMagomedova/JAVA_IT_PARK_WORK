package controller;

import models.Guest;
import models.Room;
import org.springframework.ui.ModelMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import services.GuestService;

import java.util.List;

@Controller
public class FreemarkerController {

    @Autowired
    private GuestService guestService;


    @GetMapping(value = "/guests")
    public String getGuests(@ModelAttribute("model")ModelMap model,
                           @RequestParam("lastName") String lastName) {
        List<Guest> guests = guestService.getByLastName(lastName);
        model.addAttribute("guests", guests);
        return "guests";
    }

    @GetMapping(value = "/rooms")
    public String getRooms(@ModelAttribute("room") ModelMap model) {
        List <Room> rooms = guestService.getAllRooms();
        model.addAttribute ("room",rooms);
        return "room";
    }

}

