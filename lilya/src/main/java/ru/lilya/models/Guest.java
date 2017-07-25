package ru.lilya.models;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="guests")
public class Guest {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column
    private String passport;

    @OneToMany (mappedBy = "guest", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GuestRoom> guestRooms;

  //  @OneToOne
 //   @JoinColumn(name = "room_id")
 //   private Room room;

    public Guest() {
    }

    public Guest( String firstName, String lastName, String passport) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.passport = passport;
    }

    public int getId() {
        return id;
    }

    public void setId(int id){this.id = id; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public List<GuestRoom> getGuestRooms() {
        return guestRooms;
    }

    public void setGuestRooms(List<GuestRoom> guestRooms) {
        this.guestRooms = guestRooms;
    }/*

    public void addRoomToGuest(Room room) {
        guestRooms.add(room.getId(), guestRoom);
    }
*/
    @Override
    public String toString() {
        return "Guest{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", passport='" + passport + '\'' +
                '}';
    }

}
