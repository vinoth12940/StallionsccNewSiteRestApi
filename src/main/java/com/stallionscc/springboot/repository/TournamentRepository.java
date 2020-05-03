package com.stallionscc.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.entity.Tournament;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long>{

}
