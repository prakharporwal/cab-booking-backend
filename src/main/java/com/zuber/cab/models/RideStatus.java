package com.zuber.cab.models;

public enum RideStatus {
    ACCEPTED(""),
    DRIVER_ARRIVING(""),
    STARTED(""),
    IN_PROGRESS(""),
    ENDED(""),
    CANCELLED_BY_USER(""),
    CANCELLED_BY_DRIVER("");
    public final String description;
    private RideStatus(String description){
        this.description =description;
    }

}
