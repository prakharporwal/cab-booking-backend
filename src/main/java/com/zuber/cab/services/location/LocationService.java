package com.zuber.cab.services.location;

import com.zuber.cab.models.Location;

import java.util.ArrayList;

public interface LocationService {
    ArrayList<Location> locateNearbyCabs();
}
