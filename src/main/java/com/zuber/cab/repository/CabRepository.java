package com.zuber.cab.repository;

import com.zuber.cab.models.CabDetails;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CabRepository extends CrudRepository<CabDetails,Long> {
}
