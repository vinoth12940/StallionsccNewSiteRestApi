package com.stallionscc.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.entity.StallionsExtra;

@Repository
public interface StallionsTotalExtraRepository extends JpaRepository<StallionsExtra, Long>{

}
