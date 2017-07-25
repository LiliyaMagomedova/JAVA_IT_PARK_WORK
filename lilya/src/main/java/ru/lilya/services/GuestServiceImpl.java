package ru.lilya.services;

import ru.lilya.dao.GuestDao;
import ru.lilya.dao.RoomDao;
import ru.lilya.models.Guest;
import ru.lilya.models.GuestRoom;
import ru.lilya.models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao guestDao;

    @Autowired
    private RoomDao roomDao;

    @Override
    public void addGuest(Guest guest) {
        guestDao.save(guest);
    }


    public void addRoomToGuest(int guestId, int roomId) {
        Guest guest = guestDao.findOne(guestId);
        Room room = roomDao.findOne(roomId);
        GuestRoom guestRoom = new GuestRoom(guest,room);
        guest.getGuestRooms().add(guestRoom);
        room.getGuestRooms().add(guestRoom);
    }

    @Override
    public List<Room> getRooms() {
        return roomDao.findAll();
    }
    public List<Guest> getGuests(){return guestDao.findAll();}

    @Override
    public boolean isFree(int roomId, String arrivalDate)  throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat();
        format.applyPattern("dd.MM.yyyy");
        Date arrDate= format.parse(arrivalDate);
        return false;
    }

    ;
}
