package com.zuber.cab.services;

import com.zuber.cab.models.CabDetails;
import com.zuber.cab.models.Location;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    public RideServiceImpl() {
    }

    @Override
    public CabDetails allocateCab() {
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
