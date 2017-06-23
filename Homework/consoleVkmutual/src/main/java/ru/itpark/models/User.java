package ru.itpark.models;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by Л on 22.06.2017.
 */
public class User {
    @JsonProperty("user_id")
    private int userId;

    @JsonProperty("first_name")
    private String firstName;

    @JsonProperty("last_name")
    private String lastName;

    @JsonProperty("country")
    private String country;

    @JsonProperty("city")
    private String city;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public User() {
    }

    public User(int userId, String firstname, String lastname, String country, String city) {
        this.userId = userId;
        this.firstName = firstname;
        this.lastName = lastname;
        this.country = country;
        this.city = city;
    }

    public String toString () {
        return firstName+" "+lastName+" "+userId+" "+city+ " "+country;
    }

    public boolean equals (Object user){
        if (user!=null && user instanceof User) {
            User that = (User) user;
            return this.userId == that.userId;
        } else return false;
    }
}
