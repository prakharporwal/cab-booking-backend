package com.zuber.cab.services;

import com.zuber.cab.models.Cab;
import com.zuber.cab.models.Location;

public interface RideService {
    Cab allocateCab();
    Location trackRide();
    boolean updateRideStatus();
}
