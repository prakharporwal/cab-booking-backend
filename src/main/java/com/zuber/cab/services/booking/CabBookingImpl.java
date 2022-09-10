package com.zuber.cab.services.booking;

import com.zuber.cab.services.location.LocationService;
import com.zuber.cab.services.location.LocationServiceImpl;

public class CabBookingImpl implements CabBooking{
    @Override
    public void book() {
        LocationService locationService = new LocationServiceImpl();

    }
}
