package io.upgrad.frs;

public class RegularTicket extends Ticket{
    private String specialServices;

    public RegularTicket(String pnr, String departure, String destination,
                         String departureDateTime, String arrivalDateTime,
                         String seatNo, float price, boolean cancelled, Flight flight, Passenger passenger) {
        super(pnr,departure, destination, departureDateTime, arrivalDateTime, seatNo, price, cancelled, flight, passenger);
        this.specialServices = null;
    }

    public String getSpecialServices() {
       return this.specialServices;
    }
    public void updateSpecialServices(String service) {
        //needs improvisation
        this.setSpecialServices(service);
    }

    //getters and setters

    public void setSpecialServices(String specialServices) {
        this.specialServices = specialServices;
    }
}
