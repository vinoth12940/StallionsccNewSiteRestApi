package com.stallionscc.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.entity.Matches;
import com.stallionscc.springboot.entity.StallionsScorecard;

@Repository
public interface ScorecardRepository extends JpaRepository<StallionsScorecard, Long> {

}
