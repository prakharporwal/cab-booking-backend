package com.zuber.cab.services.booking;

import com.zuber.cab.models.Customer;
import com.zuber.cab.models.Driver;

import javax.annotation.security.DeclareRoles;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public interface CabBooking {
    Boolean book(double a, double b);

    Optional<Customer> customerDetails();

    Map<Integer,Integer> mapFunction(int id);

//    boolean boolHaiParIntBhejataHai();
//    Boolean boolHaiboolBhejataHai();
}

