package dao;

import models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface RoomDao extends JpaRepository<Room, Integer> {

    @Modifying
    @Query("select room from Room room where room.isAvailable = true ")
    List<Room> findAvailable ();

    @Modifying
    @Query("select room from Room room where room.guestIdguestId = ?1 ")
    List<Room> findByOwner (int passport);

}
