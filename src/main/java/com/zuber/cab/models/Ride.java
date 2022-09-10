package com.zuber.cab.models;

public class Ride {
    private String rideId;
    private Cab cab;
    private Driver driver;
    private Customer[] customers; //many or one for shared rides
    private String otp;
    private Double cost;
    private RideStatus rideStatus;
    private boolean paymentStatus;
}
