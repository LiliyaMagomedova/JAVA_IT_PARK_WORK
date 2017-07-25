package ru.lilya.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@Table (name = "calendar")
public class GuestRoom implements Serializable {

    @Id
    @ManyToOne
    @JoinColumn(name = "guest_id")
    private Guest guest;

    @Id
    @ManyToOne
    @JoinColumn(name = "room_id")
    private Room room;

    @Column (name = "arrival_date")
    private Date arrivalDate;

    @Column(name = "departure_date")
    private Date departureDate;

    public GuestRoom() {
    }

    public GuestRoom(Guest guest, Room room) {
        this.guest = guest;
        this.room = room;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }
}
