package services;

import models.Guest;
import models.Room;

import java.util.List;

public interface GuestService {
    Guest getGuestByPassport (int passport);
    List<Guest> getAllGuests ();
    List<Guest> getByLastName (String lastName);
    List<Room> getOwedByUser (int passport);
    List <Room> getAllRooms ();
    List <Room> getAllFreeRooms ();
}
