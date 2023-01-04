package com.zuber.cab.services.booking;

import com.zuber.cab.models.Customer;
import com.zuber.cab.models.Driver;
import com.zuber.cab.services.location.LocationService;
import com.zuber.cab.services.location.LocationServiceImpl;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CabBookingImpl implements CabBooking {
    @Override
    public Boolean book(double a, double b) {
        LocationService locationService = new LocationServiceImpl();
        Boolean x = null;
//        x = false;
        return x;
    }

    @Override
    public Map<Integer, Integer> mapFunction(int id) {
        Map<Integer,Integer> m = new HashMap<>();
        m.put(3,5);
        m.put(4,20);
        m.put(6,80);
        m.put(8,50);

        return m;
    }

    @Override
    public Optional<Customer> customerDetails(){
//        List<Integer> list =new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);

        Customer customer =  new Customer("customer-test","lallu","laal","9291412324");

        return Optional.of(customer);
    }
}
