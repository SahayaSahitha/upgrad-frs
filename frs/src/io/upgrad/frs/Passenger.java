package io.upgrad.frs;

public class Passenger {
    private final int id;
    private static int idCounter;

    static {
        idCounter = 0;
    }

    private static class Contact {
        private String name, phone, email;

        public Contact(String name, String phone, String email) {
            this.name = name;
            this.phone = phone;
            this.email = email;
        }
        public String getContactDetails() {
            return this.name + "," + this.phone + "," +this.email;
        }
    }

    private static class Address {
        private String street, city, state;

        public Address(String street, String city, String state) {
            this.street = street;
            this.city = city;
            this.state = state;
        }
        public String getAddressDetails() {
            return this.street + "," + this.city + "," +this.state;
        }
    }
    private Address address;
    private Contact contact;

    public Passenger(String name, String phone, String email, String street, String city, String state) {
        this.id = ++idCounter;
       this.address = new Address(street, city, state);
       this.contact = new Contact(name, phone, email);
    }

    public String getContact() {
        return this.contact.getContactDetails();
    }

    public String getAddress() {
        return this.address.getAddressDetails();
    }
    public int getPassengerCount() {
        return getIdCounter();
    }

    public void updateContactDetails(String phone, String email){
        this.setContact(new Contact(this.getName(), phone, email));
    }
    public void updateAddressDetails(String street, String city, String state){
        this.setAddress(new Address(street, city, state));

    }

    //getters and setters
    public void setAddress(Address address) {
        this.address = address;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public int getId() {
        return id;
    }
    public static int getIdCounter() {
        return idCounter;
    }

    public String getName() {
        return contact.name;
    }

    public void setName(String name) {
        this.contact.name = name;
    }

    public String getPhone() {
        return contact.phone;
    }

    public void setPhone(String phone) {
        this.contact.phone = phone;
    }

    public String getEmail() {
        return contact.email;
    }

    public void setEmail(String email) {
        this.contact.email = email;
    }

    public String getStreet() {
        return address.street;
    }

    public void setStreet(String street) {
        this.address.street = street;
    }

    public String getCity() {
        return address.city;
    }

    public void setCity(String city) {
        this.address.city = city;
    }

    public String getState() {
        return address.state;
    }

    public void setState(String state) {
        this.address.state = state;
    }
}
