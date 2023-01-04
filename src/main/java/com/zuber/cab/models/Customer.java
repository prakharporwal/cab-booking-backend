package com.zuber.cab.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Customer")
@Entity
public class Customer extends Auditable{
     private String customerId;
     private String firstName;
     private String lastName;
     private String phoneNumber;
}