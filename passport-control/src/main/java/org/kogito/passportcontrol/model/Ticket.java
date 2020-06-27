package org.kogito.passportcontrol.model;

public class Ticket {

    private final String from;
    private final String to;
    private final int day;
    private final int month;
    private final int year;
    private final int hour;
    private final int minute;
    private final String flightNumber;

    public Ticket(String from, String to, int day, int month, int year, int hour, int minute, String flightNumber) {
        this.from = from;
        this.to = to;
        this.day = day;
        this.month = month;
        this.year = year;
        this.hour = hour;
        this.minute = minute;
        this.flightNumber = flightNumber;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public String getFlightNumber() {
        return flightNumber;
    }


}