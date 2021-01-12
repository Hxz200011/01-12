package Plane.make.ticket;

import java.util.SplittableRandom;

public class Flight {
    private String id;
    private String planeType;//飞机型号
    private String departureAirport;//飞机出发点
    private String destinationAirPort;//飞机到达的目的地
    private String departureTime;//飞机的飞行时长
    private String seatNO;
    private String totalseatsnumber;

    public String getSeatNO() {
        return seatNO;
    }

    public void setSeatNO(String seatNO) {
        this.seatNO = seatNO;
    }

    public String getTotalseatsnumber() {
        return totalseatsnumber;
    }

    public void setTotalseatsnumber(String totalseatsnumber) {
        this.totalseatsnumber = totalseatsnumber;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public void setDepartureAirport(String departureAirport) {
        this.departureAirport = departureAirport;
    }

    public String getDestinationAirPort() {
        return destinationAirPort;
    }

    public void setDestinationAirPort(String destinationAirPort) {
        this.destinationAirPort = destinationAirPort;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }
}
