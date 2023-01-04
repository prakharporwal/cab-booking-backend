package com.zuber.cab.services;

import com.zuber.cab.models.CabDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zuber.cab.repository.CabRepository;

@Service
public class CabDetailsServiceImpl implements CabDetailsService{
     @Autowired
     private CabRepository cabRepository;
    @Override

    public CabDetails registerNewCab(CabDetails cabDetails) {
        return cabRepository.save(cabDetails);
    }
}

