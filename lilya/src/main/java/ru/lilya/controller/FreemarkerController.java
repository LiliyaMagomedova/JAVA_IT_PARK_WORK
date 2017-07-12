package ru.lilya.controller;

import org.springframework.web.bind.annotation.*;
import ru.lilya.models.Guest;
import ru.lilya.models.GuestRoom;
import ru.lilya.models.Room;
import org.springframework.ui.ModelMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.lilya.services.GuestService;

import java.util.List;
import java.sql.Date;

@Controller
public class FreemarkerController {

    @Autowired
    private GuestService guestService;



    @RequestMapping (value = "new", method = RequestMethod.POST)
    public String addtobase (@ModelAttribute ("guest") Guest guest,
                            @RequestParam ("lastName") String lastName,
                           @RequestParam ("firstName") String firstName,
                           @RequestParam ("passport") String passport ) {

        guest.setLastName(lastName);
        guest.setFirstName(firstName);
        guest.setPassport(passport);
        guestService.addGuest(guest);
        return "redirect:guests";
    }

    @RequestMapping (value = "add", method = RequestMethod.POST)
    public String addRoom (@ModelAttribute ("guest") Guest guest,
                           @RequestParam ("guestId") int guestId,
                           @RequestParam ("roomId") int roomId ) {
        guestService.addRoomToGuest(roomId,guestId);
        return "redirect:guests";
    }



    @GetMapping(value = "/newguest")
    public String addnew(@ModelAttribute ("model") Guest model){
        return "newguest";
    }

    @GetMapping(value = "/addroom")
    public String addnewroom(@ModelAttribute ("model") Guest model){
        return "addroom";
    }



    @GetMapping(value = "/guests")
    public String getGuests (@ModelAttribute ("model") ModelMap model) {
        List<Guest> guests = guestService.getGuests();
        model.addAttribute("guests",guests);
        return "guests";
    }

    @GetMapping(value = "/rooms")
    public String getRooms(@ModelAttribute("model") ModelMap model) {
        List<Room> rooms = guestService.getRooms();
        model.addAttribute("rooms", rooms);
        return "rooms";
    }

}

