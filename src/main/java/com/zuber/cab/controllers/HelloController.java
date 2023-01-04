package com.zuber.cab.controllers;

import com.zuber.cab.services.booking.CabBooking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.format.Formatter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.spi.LocaleNameProvider;

@RestController
public class HelloController{

    @Autowired
    CabBooking  booking;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }

    @RequestMapping(value = "/add/{a}/{b}",method = RequestMethod.GET)
    public ResponseEntity<?> add(@PathVariable double a, @PathVariable double b){
//        Long al = Long.valueOf(a);
//        Long bl = Long.valueOf(b);
        Boolean ans =  booking.book(a, b);
        return ResponseEntity.ok(ans);
    }


    @RequestMapping(value = "/map/{a}",method = RequestMethod.GET)
    public ResponseEntity<?> mapping(@PathVariable int a){
//        Long al = Long.valueOf(a);
//        Long bl = Long.valueOf(b);
        Map<Integer,Integer> ans =  booking.mapFunction(a);
        return ResponseEntity.ok(ans);
    }

    @RequestMapping(value = "/optional",method = RequestMethod.GET)
    public Optional<?> checkOptional(){
        return booking.customerDetails();
    }

}

