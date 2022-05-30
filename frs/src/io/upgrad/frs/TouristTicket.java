package io.upgrad.frs;

import java.util.ArrayList;
import java.util.List;

public class TouristTicket extends Ticket {
    private String hotelAddress;
    private List<String> selectedTouristLocation;

    public TouristTicket(String pnr, String departure, String destination, String departureDateTime, String arrivalDateTime, String seatNo, float price, boolean cancelled, String hotelAddress, Flight flight, Passenger passenger) {
        super(pnr,departure, destination, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.hotelAddress = hotelAddress;
        this.selectedTouristLocation = new ArrayList<>();
    }

    public String getHotelAddress() {
       return this.hotelAddress;
    }
    public List<String> getTouristLocation() {
        return this.selectedTouristLocation;
    }

    public void addTouristLocation(String location) {
        if(selectedTouristLocation.size() <= 5)
        selectedTouristLocation.add(location);
    }
    public void removeTouristLocation(String location) {
        selectedTouristLocation.remove(location);
    }

    // getters and setters

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public List<String> getSelectedTouristLocation() {
        return selectedTouristLocation;
    }

    public void setSelectedTouristLocation(List<String> selectedTouristLocation) {
        this.selectedTouristLocation = selectedTouristLocation;
    }
}
