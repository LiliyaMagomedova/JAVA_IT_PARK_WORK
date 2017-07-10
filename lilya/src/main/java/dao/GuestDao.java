package dao;
import org.springframework.data.jpa.repository.*;
import models.Guest;

import java.util.List;

public interface GuestDao extends JpaRepository<Guest,Integer> {

Guest findByPassport (int passport);

List<Guest> findByLastName (String lastName);

@Modifying
@Query("")
void insertNewGuest (String firstName, String lastName, int passport);


}
