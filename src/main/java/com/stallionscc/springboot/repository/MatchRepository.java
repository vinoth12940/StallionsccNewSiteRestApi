package com.stallionscc.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.entity.Matches;

@Repository
public interface MatchRepository extends JpaRepository<Matches, Long>{

}
