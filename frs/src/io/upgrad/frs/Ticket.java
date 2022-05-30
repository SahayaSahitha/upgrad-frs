package io.upgrad.frs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Ticket {
    private String pnr, departure, destination, departureDateTime, arrivalDateTime, seatNo;
    private float price;
    private boolean cancelled;
    private Flight flight;
    private Passenger passenger;

    public Ticket(String pnr, String departure, String destination, String departureDateTime, String arrivalDateTime,
                  String seatNo, float price, boolean cancelled, Flight flight, Passenger passenger) {
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.departureDateTime = departureDateTime;
        this.arrivalDateTime = arrivalDateTime;
        this.seatNo = seatNo;
        this.price = price;
        this.cancelled = cancelled;
        this.flight = flight;
        this.passenger = passenger;
    }

    public String CheckStatus() {
        return this.isCancelled()? "Cancelled" : "confirmed";
    }
    public String getFlightDuration() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        LocalDateTime departureDateTime = LocalDateTime.parse(this.getDepartureDateTime(), formatter);
        LocalDateTime arrivalDateTime = LocalDateTime.parse(this.getArrivalDateTime(), formatter);

        int durationDays = arrivalDateTime.getDayOfMonth() - departureDateTime.getDayOfMonth();
        int durationHrs = arrivalDateTime.getHour() - departureDateTime.getHour();
        int durationMinutes = Math.abs(arrivalDateTime.getMinute() - departureDateTime.getMinute());

        return durationDays + " Days : " + durationHrs + " Hours : " + durationMinutes + " minutes";
    }
    public void cancelTicket() {
        this.setCancelled(true);
    }

    //getters and setters
    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDepartureDateTime() {
        return departureDateTime;
    }

    public void setDepartureDateTime(String departureDateTime) {
        this.departureDateTime = departureDateTime;
    }

    public String getArrivalDateTime() {
        return arrivalDateTime;
    }

    public void setArrivalDateTime(String arrivalDateTime) {
        this.arrivalDateTime = arrivalDateTime;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public boolean isCancelled() {
        return cancelled;
    }

    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
