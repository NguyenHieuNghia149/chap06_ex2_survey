package murach.business;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private String firstName;
    private String lastName;
    private String email;
    private String hearFrom;

    private boolean wantsUpdates;
    private String contact;


    public User() {
        firstName = "";
        lastName = "";
        email = "";
        hearFrom = "";
        wantsUpdates = false;
        contact = "";
    }

    public User(String firstName, String lastName, String email, String hearFrom, boolean wantsUpdates, String contact) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hearFrom = hearFrom;
        this.wantsUpdates = wantsUpdates;
        this.contact = contact;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setHearFrom(String hearFrom) {
        this.hearFrom = hearFrom;
    }

    public String getHearFrom() {
        return hearFrom;
    }


    public boolean getWantsUpdates() {
        return wantsUpdates;
    }
    public void setWantsUpdates(boolean wantsUpdates) {
        this.wantsUpdates = wantsUpdates;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getContact() {
        return contact;
    }

}

