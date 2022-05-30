package io.upgrad.frs;

public class Main {

    public static void main(String[] args) {

        Flight flight1 = new Flight("AB007", "Vistara", 100, 85);
        Flight flight2 = new Flight("SD5588", "IndiGo", 168, 100);

        Passenger passenger1 = new Passenger("Sandeep", "7338484949", "sandeep@gmail.com", "wall street", "Bangalore", "karnataka");
        Passenger passenger2 = new Passenger("Yashwanth", "1234569870", "yashwanth@gmail.com", "bank street", "JP Nagar", "karnataka");

        RegularTicket regularTicket = new RegularTicket("A101","KIA", "Srinagar","2022-02-01 16:30","2022-02-01 17:30", "A13",251487.00f, true, flight1, passenger1);
        TouristTicket touristTicket = new TouristTicket("AB07","KIA", "Delhi", "2022-02-01 16:56","2022-02-03 21:50","A25",251487.00f, true, "Hotel Ashoka, Delhi", flight2, passenger2);

        System.out.println("Flight Details");
        System.out.println(flight1.getFlightDetails());

        System.out.println("\nPassanger details");
        System.out.println("Name: " + passenger1.getName() + ", Phone: "+ passenger1.getPhone() + ", Email: " + passenger1.getEmail());

        System.out.println("\nTicket details");
        System.out.println(" PNR: " +regularTicket.getPnr() +
                "\n Airline: " + regularTicket.getFlight().getAirline() +
                "\n Flight Number: " + regularTicket.getFlight().getFlightNumber() +
                "\n Seat Number: " + regularTicket.getSeatNo() +
                "\n Departure: " + regularTicket.getDeparture() +
                "\n Destination: " +regularTicket.getDestination() +
                "\n Duration of Journey: " +regularTicket.getFlightDuration());

    }
    public static void printTicketDetails(Ticket ticket){
        System.out.println("PNR: " + ticket.getPnr());
    }
}
