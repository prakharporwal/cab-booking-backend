package com.zuber.cab.models;

import javax.persistence.Entity;

@Entity
public class BookingDetails extends Auditable{
    private Long cabId;
    private Long customerId;
}
