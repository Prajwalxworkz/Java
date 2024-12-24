package com.xworkz.java.runner;

import com.xworkz.java.logic.BusBooking;

public class BusBookingRunner {
    public static void main(String[] args) {
        BusBooking bill = new BusBooking("KA05 MG3467","28-10-2024","23:37",856.00,"29-10-2024","6:00","Mumbai","Bengaluru","Male");
        bill.getInfo();
    }
}
