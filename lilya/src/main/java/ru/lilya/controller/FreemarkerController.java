package ru.lilya.controller;

import org.apache.catalina.connector.Response;
import org.springframework.web.bind.annotation.*;
import ru.lilya.models.Guest;
import ru.lilya.models.GuestRoom;
import ru.lilya.models.Room;
import org.springframework.ui.ModelMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import ru.lilya.services.GuestService;

import java.util.List;

@Controller
public class FreemarkerController {

    @Autowired
    private GuestService guestService;

    @GetMapping (value = "new")
    public String addtobase (@RequestParam ("lastName") String lastName,
                             @RequestParam ("firstName") String firstName,
                             @RequestParam ("passport") String passport ) {
        guestService.addGuest(new Guest (firstName,lastName,passport));
        return "redirect:guests";
    }

    @GetMapping(value = "/newguest")
    public String addnew(@ModelAttribute ("model") Guest model){
        return "newguest";
    }

    @GetMapping(value = "/main")
    public String home(@ModelAttribute ("model") Guest model){
        return "main";
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

    @GetMapping(value = "/addroom")
    public String addnewroom(@ModelAttribute ("model") Guest model){
        return "addroom";
    }

    @GetMapping (value = "add")
    public String addRoomToGuest (@RequestParam ("guestId") int guestId,
                                  @RequestParam ("roomId") int roomId ) {
        guestService.addRoomToGuest(guestId,roomId);
        return "redirect:guests";
    }
}

