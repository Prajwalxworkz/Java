package com.xworkz.calenderapp;

import com.xworkz.calenderapp.calender.GoogleCalender;
import com.xworkz.calenderapp.constants.EventType;
import com.xworkz.calenderapp.event.Event;
import com.xworkz.calenderapp.exception.EventNotFoundByStartDateException;

import java.util.Scanner;

public class CalenderRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        System.out.println("********************************************************");

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number of events to be added: ");
        int size = s.nextInt();
        GoogleCalender calender = new GoogleCalender(size);
        for (int i = 0; i < size; i++) {
            Event event = new Event();
            System.out.println("Enter the event id:");
            event.setEventId(s.nextInt());
            System.out.println("Enter the name: ");
            s.nextLine();
            event.setWho(s.nextLine());
            System.out.println("Enter the start date: ");
            event.setStartDate(s.next());
            System.out.println("Enter the end date: ");
            event.setEndDate(s.next());
            System.out.println("Enter the event type: ");
            event.setEventType(EventType.valueOf(s.next()));
            System.out.println("Enter the description: ");
            s.nextLine();
            event.setDescription(s.nextLine());
            System.out.println("is it an all day event? : ");
            event.setAllDayEvent(s.nextBoolean());
            calender.addEvent(event);
        }
        String value = null;
        do {
            System.out.println("-----------------------------------------------------------");
            System.out.println("Press 1 to display all events ");
            System.out.println("Press 2 to display the event based on id ");
            System.out.println("Press 3 to display person's name  based on start date ");
            System.out.println("Press 4 to display event based on person's name ");
            System.out.println("Press 5 to display event based on start date ");
            System.out.println("Press 7 to display event based on end date ");
            System.out.println("Press 8 to display event based on event type ");
            System.out.println("Press 9 to edit the  start date based on person's name ");
            System.out.println("Press 10 to delete the  event based on id ");
            System.out.println("-----------------------------------------------------------");
            System.out.println("Enter the option of your choice: ");
            int option = s.nextInt();
            switch (option) {
                case 1:
                    calender.getAllEvents();
                    break;

                case 2:
                    System.out.println("Enter the id : ");
                    Event eventReturned = calender.getEventById(s.nextInt());
                    calender.displayEventDetails(eventReturned);
                    break;
                case 3:
                    System.out.println("Enter the start date ");
                    String[] who = calender.getWhoByStartDate(s.next());
                    System.out.println("The person on leave is/are:");
                    int start = 1;
                    for (String person : who) {
                        System.out.println(start++ + "." + person);
                    }
                    break;
                case 4:
                    System.out.println("Enter the person's name");
                    s.nextLine();
                    Event eventReturned1 = calender.getEventByWho(s.nextLine());
                    calender.displayEventDetails(eventReturned1);
                    break;

                case 5:
                    try {
                        System.out.println("Enter the start date ");
                        Event returnedEvent = calender.getEventByStartDate(s.next());
                        calender.displayEventDetails(returnedEvent);
                    }catch(EventNotFoundByStartDateException e){
                        e.printStackTrace();
                    }
                    break;

                case 7:
                    System.out.println("Enter the end date ");
                    Event returnedEvent1 = calender.getEventByEndDate(s.next());
                    calender.displayEventDetails(returnedEvent1);
                    break;

                case 8:
                    System.out.println("Enter the event type  ");
                    Event returnedEvent2 = calender.getEventByEventType(EventType.valueOf(s.next().toLowerCase()));
                    calender.displayEventDetails(returnedEvent2);
                    break;

                case 9:
                    System.out.println("Enter the name and start date by giving a space");
                    boolean isStartDateUpdated = calender.updateStartDateByWho(s.next(), s.next());
                    System.out.println("Is start date updated: " + isStartDateUpdated);

                case 10:
                    System.out.println("Enter the id ");
                    boolean isEventDeleted = calender.deleteEventById(s.nextInt());
                    System.out.println("Is event deleted: " + isEventDeleted);
                    break;
                default:
                    System.out.println("Please enter a valid option");
            }
            System.out.println("Do you want to continue? (Type Yes or No ) ");
            value = s.next();
        } while (value.equalsIgnoreCase("Yes"));
        System.out.println("Thank you for co-operating.....");
        System.out.println("********************************************************");
        System.out.println("main ended");
    }
}

