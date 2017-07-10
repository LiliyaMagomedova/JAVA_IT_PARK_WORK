package models;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "rooms")
public class Room {

    @Id
    private int id;

    @Column(name = "guest_id")
    private int guestId;


    @Column (name = "bed_number")
    private int bedNumber;

    @Column (name = "is_available")
    private boolean isAvailable;

    @Column (name = "arrival_date")
    private Date arrivalDate;

    @Column (name = "departure_date")
    private Date departureDate;

    public Room() {
    }

    public Room(int id, int humanId, boolean fullRoom, int bedNumber) {
        this.id = id;
        this.guestId = humanId;
        this.bedNumber = bedNumber;
    }

    public int getId() {
        return id;
    }


    public int getGuestId() {
        return guestId;
    }

    public void setGuestId(int humanId) {
        this.guestId = humanId;
    }

    public int getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(int bedNumber) {
        this.bedNumber = bedNumber;
    }
}
