package Bean;

import Plane.make.ticket.Flight;

import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight);
    Set <Flight> getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirPort(String DepartureAirPort);
    Flight getFlightByDestinationAirPorte(String DestinationAirPorte);
    void updateFlight(Flight flight);


}
