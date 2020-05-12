package com.stallionscc.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.entity.Tournament;

@Repository
public interface TournamentRepository extends JpaRepository<Tournament, Long>{
	@Query("SELECT t FROM Tournament t WHERE year(t.start_date) = ?1 ")
	List<Tournament> getTournamentByYear(int year);
}
