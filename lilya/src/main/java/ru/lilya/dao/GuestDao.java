package ru.lilya.dao;

import org.springframework.data.jpa.repository.*;
import ru.lilya.models.Guest;


import java.util.List;

public interface GuestDao extends JpaRepository<Guest, Integer> {

    Guest findByPassport(String passport);
    List<Guest> findByLastName(String lastName);
}
