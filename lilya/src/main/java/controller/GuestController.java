package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import services.GuestService;

@RestController
public class GuestController {

    @Autowired
    GuestService guestService;

}
