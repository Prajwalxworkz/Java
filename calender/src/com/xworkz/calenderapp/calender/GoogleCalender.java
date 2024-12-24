package com.xworkz.calenderapp.calender;

import com.xworkz.calenderapp.constants.EventType;
import com.xworkz.calenderapp.event.Event;
import com.xworkz.calenderapp.exception.*;

import java.util.Arrays;
import java.util.Objects;

public class GoogleCalender implements Calender {
    Event[] event = null;
    //   Event event3 = new Event();
    int index;

    public GoogleCalender(int size) {
        event = new Event[size];
    }

    public boolean addEvent(Event event) {
        boolean isEventAdded = false;
        if (this.event.length > index) {
            if (event != null) {
                if (event.getEventId() > 0 && event.getWho() != null && event.getStartDate() != null && event.getEndDate() != null && event.getEventType() != null && event.getDescription() != null && event.isAllDayEvent()) {
                    this.event[index++] = event;
                    isEventAdded = true;

                } else {
                    System.out.println("incorrect field/fields");
                }
            } else {
                System.out.println("event is null");
            }
        } else {
            System.out.println("Memory is full");
        }


        return isEventAdded;
    }

    public void getAllEvents() {
        try {
            if (event != null) {
                for (Event s : this.event) {
                    System.out.println(s);
                }
            }
            GetAllEventsException getAllEventsException=new GetAllEventsException("Events are null");
            throw getAllEventsException;
        }catch (GetAllEventsException e){
           e.printStackTrace();
        }
    }

/*    public void getEventById(int id) {
        boolean isIdFound = true;
        for (int start = 0; start < this.event.length; start++) {

            if (id != event[start].getEventId()) {
                continue;
            } else {
                System.out.println("**********************************");
                System.out.println("Values based on id " + id + " are: ");
                System.out.println("Who: " + event[start].getWho());
                System.out.println("start date: " + event[start].getStartDate());
                System.out.println("End date: " + event[start].getEndDate());
                System.out.println("Event type: " + event[start].getEventType());
                System.out.println("Description: " + event[start].getDescription());
                System.out.println("isAllDayEvent: " + event[start].isAllDayEvent());
                System.out.println("**********************************");
            }
        }
        if (!isIdFound) {
            System.out.println("No such id found");
        }
    } */

    public Event getEventById(int id) {
        Event eventToBeReturned = null;
        System.out.println("Start of getEventById method");
        try {
            for (Event event : event) {
                if (event.getEventId() == id) {
                    eventToBeReturned = event;
                }
            }
            if (eventToBeReturned == null) {
                throw new EventNotFoundByIdException("Event id " + id + " not found");
            }
        } catch (EventNotFoundByIdException enf) {
            enf.printStackTrace();
        }
        System.out.println("End of getEventById method");
        return eventToBeReturned;
    }

    public Event getEventByWho(String who) {
        Event eventToBeReturned = null;
        System.out.println("Start of getEventByWho method");
        try {
            for (Event event1 : event) {
                if (who.equals(event1.getWho())) {
                    eventToBeReturned = event1;
                }
            }
            if (eventToBeReturned == null) {
                EventNotFoundByWhoException eventNotFoundByWhoException = new EventNotFoundByWhoException("Mentioned person" + who + " is not found");
                throw eventNotFoundByWhoException;
            }
        }catch (EventNotFoundByWhoException e){
            e.printStackTrace();
        }
        System.out.println("end of getEventByWho method");
        return eventToBeReturned;
    }

    public Event getEventByStartDate(String startDate) throws EventNotFoundByStartDateException {
        Event eventToBeReturned = null;
        System.out.println("Start of getEventByStartDte method");
        for (Event event1 : event) {
            if (event1.getStartDate().equals(startDate)) {
                eventToBeReturned = event1;
            }
        }
        if (eventToBeReturned == null)
        {
            EventNotFoundByStartDateException eventNotFoundByStartDateException=new EventNotFoundByStartDateException("Mentioned start date "+startDate+" is not found");
            throw eventNotFoundByStartDateException;
        }
        System.out.println("Start of getEventByStartDate method");
        return eventToBeReturned;
    }

    public Event getEventByEndDate(String endDate) {
        Event eventToBeReturned = null;
        System.out.println("Start of getEventByEndDate method");
        try {
            for (Event event1 : event) {
                if (event1.getEndDate() == endDate) {
                    eventToBeReturned = event1;
                }
            }
            if (eventToBeReturned == null)
            {
                EventNotFoundByEndDateException eventNotFoundByEndDateException=new EventNotFoundByEndDateException("Mentioned end date "+endDate+" not found");
                throw eventNotFoundByEndDateException;
            }
        }catch (EventNotFoundByEndDateException e){
            e.printStackTrace();
        }
        System.out.println("Start of getEventByEndDate method");
        return eventToBeReturned;
    }

    public Event getEventByEventType(EventType eventType) {
        Event eventToBeReturned = null;
        System.out.println("Start of getEventByEventType method ");
        try {
            for (Event event1 : event) {
                if (event1.getEventType() == eventType) {
                    eventToBeReturned = event1;
                }
            }
            if (eventToBeReturned == null)
            {
                EventNotFoundByEventTypeException eventNotFoundByEventTypeException= new EventNotFoundByEventTypeException(" Mentioned Event type "+eventType+" is not found");
                throw eventNotFoundByEventTypeException;
            }
        }catch (EventNotFoundByEventTypeException e){
            e.printStackTrace();
        }
        System.out.println("End of getEventByEventType method ");
        return eventToBeReturned;
    }

  /*  public String getWhoByStartDate(String startDate){
        int count=0;
        String who=null;
        for(Event event1: event){
            if(event1.getStartDate()==startDate){
                who=event1.getWho();
               count++;
            }
        }
        System.out.println("count: "+count);
        if(who==null)
            System.out.println("No such name found");
        return  who;
    }*/


    public void displayEventDetails(Event event) {
            System.out.println(event);
    }

    public String[] getWhoByStartDate(String startDate) {
        int count = 0;

        for (Event event1 : event) {
            if (event1.getStartDate().equals(startDate)) {
                count++;
            }
        }
        String[] who = new String[count];
        int start = 0, initial = 0;
        try {
            for (Event event2 : event) {
                if (event2.getStartDate().equals(startDate)) {
                    who[initial++] = event2.getWho();
                }
            }
            if (count == 0) {
                WhoNotFoundByStartDateException whoNotFoundByStartDateException = new WhoNotFoundByStartDateException("No person is found by the given start date " + startDate);
                throw whoNotFoundByStartDateException;
            }
        } catch (WhoNotFoundByStartDateException wnfsd) {
            wnfsd.printStackTrace();
        }
        return who;
    }

    public boolean  updateStartDateByWho(String who, String updatedStartDate) {
        boolean isStartDateUpdated = false;
        try {
            for (Event event : event) {
                if (event.getWho().equals(who)) {
                    event.setStartDate(updatedStartDate);
                    isStartDateUpdated = true;
                }
            }
            if (!isStartDateUpdated) {
                WhoNotFoundToUpdateStartDateException whoNotFoundToUpdateStartDateException= new WhoNotFoundToUpdateStartDateException("Mentioned person's name "+who+" is not found");
                throw whoNotFoundToUpdateStartDateException;
            }
        }catch (WhoNotFoundToUpdateStartDateException e){
            e.printStackTrace();
        }

        return isStartDateUpdated;
    }

    public boolean updateStartDateAndEndDateByWho(String who, String updatedStartDate, String updatedEndDate) {
        boolean isStartDateAndEndDateUpdated = false;
        for (Event event : event) {
            if (event.getWho().equals(who)) {
                event.setStartDate(updatedStartDate);
                event.setEndDate(updatedEndDate);
                isStartDateAndEndDateUpdated = true;
            }
        }
        if (!isStartDateAndEndDateUpdated) System.out.println(who + " is not found ");
        return isStartDateAndEndDateUpdated;
    }

    public boolean deleteEventById(int id) {
        boolean isEventDeleted = false;
        int start, initial;
        try {
            for (start = 0, initial = 0; start < event.length; start++) {
                if (event[start].getEventId() != id) {
                    event[initial++] = event[start];
                } else isEventDeleted = true;
            }
            if (!isEventDeleted) {
                IdNotFoundToDeleteEventException idNotFoundToDeleteEventException=new IdNotFoundToDeleteEventException("Mentioned id "+id+" is not found");
                throw idNotFoundToDeleteEventException;
            }
            event = Arrays.copyOf(event, initial);
        }catch (IdNotFoundToDeleteEventException e)
        {
            e.printStackTrace();
        }

        return isEventDeleted;
    }
}

 /*   public void getEventById(int id) {
//        System.out.println(id);
  //      System.out.println("length: "+event.length);
    //    System.out.println("initially: "+index);
        boolean isIdFound = true;
        for (int start=0;start < this.event.length;start++) {
//            System.out.println("start: "+start);
//            System.out.println("inside for loop");
           // System.out.println("inside for loop index  value: "+start);
          // System.out.println(event[start].getEventId());

            if (id!=event[start].getEventId()) {
                continue;
                // isIdFound= true;
              // System.out.println("inside if condition");
               // for (Event s : this.event) {

                //}
               // break;
            }else {
                System.out.println("**********************************");
                System.out.println("Values based on id "+id+" are: ");
                System.out.println("Who: " + event[start].getWho());
                System.out.println("start date: " + event[start].getStartDate());
                System.out.println("End date: " + event[start].getEndDate());
                System.out.println("Event type: " + event[start].getEventType());
                System.out.println("Description: " + event[start].getDescription());
                System.out.println("isAllDayEvent: " + event[start].isAllDayEvent());
                System.out.println("**********************************");
            }
            //start--;
           // System.out.println("after decrement: "+start);
        }
        if (!isIdFound) {
            System.out.println("No such id found");
        }
    }  */



