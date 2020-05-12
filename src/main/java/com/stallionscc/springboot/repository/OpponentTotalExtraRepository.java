package com.stallionscc.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.entity.OpponentExtra;

@Repository
public interface OpponentTotalExtraRepository extends JpaRepository<OpponentExtra, Long>{

	
}
