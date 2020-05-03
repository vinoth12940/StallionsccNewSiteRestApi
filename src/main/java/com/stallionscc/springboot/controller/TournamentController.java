package com.stallionscc.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stallionscc.springboot.entity.Tournament;
import com.stallionscc.springboot.exception.ResourceNotFoundException;
import com.stallionscc.springboot.repository.TournamentRepository;

@RestController
@RequestMapping("/api/tournaments")
public class TournamentController {

	@Autowired
	private TournamentRepository tournamentRepository;
	
	// get all tournaments
	@GetMapping
	public List<Tournament> getAllTournaments() {
		return this.tournamentRepository.findAll();
	}
	
	
	// get Tournament by id
	@GetMapping("/{id}")
	public Tournament getTournamentById(@PathVariable (value = "id") long tournamentId) {
		return this.tournamentRepository.findById(tournamentId)
				.orElseThrow(() -> new ResourceNotFoundException("Tournament not found with id :" + tournamentId));
	}
	
	// create tournament
	@PostMapping
	public Tournament createTournament(@RequestBody Tournament tournament) {
		return this.tournamentRepository.save(tournament);
	}
	
	// update Tournament
	@PutMapping("/{id}")
	public Tournament updateTournament(@RequestBody Tournament tournament, @PathVariable ("id") long tournamentId) {
		 Tournament existingTournament = this.tournamentRepository.findById(tournamentId)
			.orElseThrow(() -> new ResourceNotFoundException("Tournament not found with id :" + tournamentId));
		 existingTournament.setTournament_name(tournament.getTournament_name());
		 existingTournament.setStart_date(tournament.getStart_date());
		 existingTournament.setEnd_date(tournament.getEnd_date());
		 existingTournament.setNo_of_matches(tournament.getNo_of_matches());
		 existingTournament.setMatch_format(tournament.getMatch_format());
		 existingTournament.setOrganiser_name(tournament.getOrganiser_name());
		 existingTournament.setOrganiser_contact(tournament.getOrganiser_contact());
		 return this.tournamentRepository.save(existingTournament);
	}
	
	// delete Tournament by id
	@DeleteMapping("/{id}")
	public ResponseEntity<Tournament> deleteTournament(@PathVariable ("id") long tournamentId){
		Tournament existingTournament = this.tournamentRepository.findById(tournamentId)
					.orElseThrow(() -> new ResourceNotFoundException("Player not found with id :" + tournamentId));
		 this.tournamentRepository.delete(existingTournament);
		 return ResponseEntity.ok().build();
	}
}
