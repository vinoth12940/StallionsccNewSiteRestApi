package com.stallionscc.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.entity.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long>{

	@Query("SELECT p FROM Player p WHERE p.is_player_active = TRUE")
	public List<Player> fetchallActiveplayers();
	
}
