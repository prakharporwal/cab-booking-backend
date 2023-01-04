package com.zuber.cab.services;

import com.zuber.cab.models.CabDetails;
import com.zuber.cab.models.Location;

public interface RideService {
    CabDetails allocateCab();
    Location trackRide();
    boolean updateRideStatus();
}
