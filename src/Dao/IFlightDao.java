package Dao;

import Plane.make.ticket.Flight;

import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight);
    Set <Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String DepartureAirPort);
    Flight getFlightByDestinationAirPort(String DestinationAirPort);
    void updateFlight(Flight flight);


}
