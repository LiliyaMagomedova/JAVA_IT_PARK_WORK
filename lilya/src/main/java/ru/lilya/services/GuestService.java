package ru.lilya.services;

import ru.lilya.models.Guest;
import ru.lilya.models.GuestRoom;
import ru.lilya.models.Room;


import java.text.ParseException;
import java.util.List;

public interface GuestService {
    void addGuest(Guest guest);
    void addRoomToGuest(int guestId, int roomId);
    List<Room> getRooms();
    List<Guest> getGuests();
    boolean isFree(int roomId, String  arrivalDate) throws ParseException;
}
