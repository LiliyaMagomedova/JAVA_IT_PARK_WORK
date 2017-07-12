package ru.lilya.dao;

import ru.lilya.models.Guest;
import ru.lilya.models.GuestRoom;
import ru.lilya.models.Room;
import java.util.Date;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomDao extends JpaRepository<Room, Integer> {

   /* @Query("select room from Room room where room.isAvailable = true ")
    List<Room> findAvailable();

    @Query("select room from Room room where room.guests.passport = ?1 ")
    List<Room> findByOwner(String passport);*/

  // @Query("select room FROM Room room JOIN room.id roomId JOIN e.projects p2 WHERE p.name = :p1 and p2.name = :p2")
 //  List<GuestRoom> findRoomA();

   List<Room> findRoomsByBedNumber (int bedNumber);
   List<Room> findRoomsByPriceBefore (int price);


}
