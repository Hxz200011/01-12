package Plane.make.ticket;

import java.util.Date;

public class Passenger {
    private String id;
    private String name;
    private String phone;
    private String cardID;
    private Date datebirth;
    private String PassengerType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCardID() {
        return cardID;
    }

    public void setCardID(String cardID) {
        this.cardID = cardID;
    }

    public Date getDatebirth() {
        return datebirth;
    }

    public void setDatebirth(Date datebirth) {
        this.datebirth = datebirth;
    }

    public String getPassengerType() {
        return PassengerType;
    }

    public void setPassengerType(String passengerType) {
        PassengerType = passengerType;
    }
}
