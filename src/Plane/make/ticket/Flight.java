package Plane.make.ticket;

import sun.dc.pr.PRError;

import java.util.SplittableRandom;

public class Flight {
    private String id;
    private String flightid;//航班号
    private String planeType;//飞机型号
    private String departureAirport;//飞机出发点
    private String destinationAirPort;//飞机到达的目的地
    private String departureTime;//飞机的飞行时间
    private int currentseatsnumber;//总座位数

    public Flight(String id, int flightid, String currentseatsnuber,String planeType,
                  String departureAirport, String departureTime, String destinationAirPort) {

    }

    public String getId() {
        return id;
    }

    public String getFlightid() {
        return flightid;
    }

    public void setFlightid(String flightid) {
        this.flightid = flightid;
    }

    public int getCurrentseatsnumber() {
        return currentseatsnumber;
    }

    public void setCurrentseatsnumber(int currentseatsnumber) {
        this.currentseatsnumber = currentseatsnumber;
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
