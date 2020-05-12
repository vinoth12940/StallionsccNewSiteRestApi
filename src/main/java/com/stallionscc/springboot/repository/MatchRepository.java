package com.stallionscc.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.entity.Matches;

@Repository
public interface MatchRepository extends JpaRepository<Matches, Long>{
	
	@Query("SELECT m FROM Matches m WHERE m.tournament_id = :tournament_id")
	public List<Matches> getmatchesBytournamentId(long tournament_id);
}
