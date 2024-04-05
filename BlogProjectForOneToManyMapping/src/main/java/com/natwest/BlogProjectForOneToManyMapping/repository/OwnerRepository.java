package com.natwest.BlogProjectForOneToManyMapping.repository;

import com.natwest.BlogProjectForOneToManyMapping.entity.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner,Integer> {
}
