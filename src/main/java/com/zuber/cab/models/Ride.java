package com.zuber.cab.models;

public class Ride extends Auditable {
    private String rideId;
    private CabDetails cabDetails;
    private Driver driver;
    private Customer[] customers; //many or one for shared rides
    private String otp;
    private Double cost;
    private RideStatus rideStatus;
    private boolean paymentStatus;
}
