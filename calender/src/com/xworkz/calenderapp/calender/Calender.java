package com.xworkz.calenderapp.calender;

import com.xworkz.calenderapp.constants.EventType;
import com.xworkz.calenderapp.event.Event;
import com.xworkz.calenderapp.exception.EventNotFoundByStartDateException;

public interface Calender {

    public boolean addEvent(Event event);
    public void getAllEvents();
    public Event getEventById(int id);
    public Event getEventByWho(String who);
    public Event getEventByStartDate(String startDate) throws EventNotFoundByStartDateException;
    public Event getEventByEndDate(String endDate);
    public Event getEventByEventType(EventType eventType);
    public void displayEventDetails(Event event);
    public String[] getWhoByStartDate(String startDate);
    public boolean updateStartDateByWho(String who, String updatedStartDate);
    public boolean deleteEventById(int id);

}
