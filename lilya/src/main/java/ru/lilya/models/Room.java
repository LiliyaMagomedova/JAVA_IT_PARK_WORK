package ru.lilya.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "rooms")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (name = "bed_number")
    private Integer bedNumber;

    @Column
    private int price;

    @OneToMany(mappedBy = "room", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GuestRoom> guestRooms;
/*
    @ManyToMany (mappedBy = "rooms")
    private List<Guest> guests;

    @OneToOne
    @JoinColumn(name = "guest_id", insertable = false, updatable = false)
    private Guest guest;*/

    public Room() {
    }

    public List<GuestRoom> getGuestRooms() {
        return guestRooms;
    }

    public void setGuestRooms(List<GuestRoom> guestRooms) {
        this.guestRooms = guestRooms;
    }

    public int getId() {
        return id;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
