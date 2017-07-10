package services;

import dao.GuestDao;
import dao.RoomDao;
import models.Guest;
import models.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService {

    @Autowired
    private GuestDao guestDao;

    @Autowired
    private RoomDao roomDao;

    @Override
    public Guest getGuestByPassport(int passport) {
        Guest guest = guestDao.findByPassport(passport);
        return guest;
    }

    @Override
    public List<Guest> getAllGuests() {
        List<Guest> guests = guestDao.findAll();
        return guests;
    }

    @Override
    public List<Guest> getByLastName(String lastName) {
        List<Guest> guestsWithLastName = guestDao.findByLastName(lastName);
        return guestsWithLastName;
    }

    @Override
    public List<Room> getOwedByUser(int passport) {
        List <Room> roomsOwedBy = roomDao.findByOwner(passport);
        return roomsOwedBy;
    }

    @Override
    public List<Room> getAllRooms() {
        List <Room> allRooms = roomDao.findAll();
        return allRooms;
    }

    @Override
    public List<Room> getAllFreeRooms() {
        List <Room> freeRooms = roomDao.findAvailable();
        return freeRooms;
    }
}
