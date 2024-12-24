package com.xworkz.java.logic;

public class BusBooking {

    String busRegistrationId;
    String bookingDate;
    String bookingTime;
    double amountPaid;
    String departureDate;
    String departureTime;
    String from;
    String to;
    String gender;

    public BusBooking(String busRegistrationId, String bookingDate, String bookingTime, double amountPaid, String departureDate, String departureTime, String from, String to, String gender) {
        this.busRegistrationId = busRegistrationId;
        this.bookingDate = bookingDate;
        this.bookingTime = bookingTime;
        this.amountPaid = amountPaid;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.from = from;
        this.to = to;
        this.gender = gender;
        }
    public void getInfo(){
        System.out.println("busRegistrationId: "+busRegistrationId);
        System.out.println("bookingDate: "+bookingDate);
        System.out.println("bookingTime: "+bookingTime);
        System.out.println("amountPaid: "+amountPaid);
        System.out.println("departureDate: "+departureDate);
        System.out.println("departureTime: "+departureTime);
        System.out.println("from: "+from);
        System.out.println("to: "+to);
        System.out.println("gender: "+gender);
    }
}
