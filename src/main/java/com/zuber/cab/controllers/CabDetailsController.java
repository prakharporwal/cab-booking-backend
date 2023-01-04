package com.zuber.cab.controllers;

import com.zuber.cab.models.CabDetails;
import com.zuber.cab.services.CabDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cab-details")
public class CabDetailsController {

    @Autowired
    CabDetailsService cabDetailsService;

    @PostMapping(value = "/create")
    public ResponseEntity<?> createNewCab(@Validated @RequestBody CabDetails newCabDetails){

        CabDetails responseCabDetails = cabDetailsService.registerNewCab(newCabDetails);

        return ResponseEntity.ok(responseCabDetails);
    }
}
