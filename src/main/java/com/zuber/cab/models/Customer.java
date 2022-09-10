package com.zuber.cab.models;

import javax.persistence.Table;

@Table(schema = "Customer")
public class Customer{
     private String customerId;
     private String firstName;
     private String lastName;
     private String phoneNumber;
}