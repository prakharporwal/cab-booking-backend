package com.zuber.cab.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Driver {
    private String driverId;
    private String firstName;
    private String lastName;
    private String imageUri;
    private String legalId;
    private String drivingLicense;
    private boolean isVerified;
    private Double rating;
}
