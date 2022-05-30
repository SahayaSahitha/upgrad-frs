package io.upgrad.frs;

public class Flight {
    private String flightNumber, airline;
    private int seatingCapacity;
    private int bookedSeats;


    public Flight(String flightNumber, String airline, int seatingCapacity, int bookedSeats) {
        this.flightNumber = flightNumber;
        this.airline = airline;
        this.seatingCapacity = seatingCapacity;
        this.bookedSeats = bookedSeats;
    }

    public String getFlightDetails(){
        return  " flightNumber: " + flightNumber +
                ", airline: " + airline +
                ", seatingCapacity: " + seatingCapacity +
                ", bookedSeats: " + bookedSeats;
    }
    /*
        returns true if the seats are available
     */
    public boolean checkAvailability() {
        return this.getBookedSeats() == this.getSeatingCapacity() ? false : true;
    }
    /*
        increase the seatBooked when new ticker is booked
     */
    public void incrementBookingCounter() {
      this.setBookedSeats(this.getBookedSeats() + 1);
    }

    //getters and setters

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
