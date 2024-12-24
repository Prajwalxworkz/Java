package com.xworkz.calenderapp.event;

import com.xworkz.calenderapp.constants.EventType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Event {
    private int eventId;
    private String who;
    private String startDate;
    private String endDate;
    private boolean allDayEvent;
    private String description;
    private EventType eventType;

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", who='" + who + '\'' +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", allDayEvent=" + allDayEvent +
                ", description='" + description + '\'' +
                ", eventType=" + eventType +
                '}';
    }
}
