package com.zuber.cab.services;

import com.zuber.cab.models.Cab;
import com.zuber.cab.models.Location;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    public RideServiceImpl() {
    }

    @Override
    public Cab allocateCab() {
        return null;
    }

    @Override
    public Location trackRide() {
        return null;
    }

    @Override
    public boolean updateRideStatus() {
        return false;
    }
}
