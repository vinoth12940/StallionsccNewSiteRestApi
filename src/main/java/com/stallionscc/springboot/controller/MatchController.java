package com.stallionscc.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stallionscc.springboot.dto.TournamentMatchDetail;
import com.stallionscc.springboot.entity.Tournament;
import com.stallionscc.springboot.repository.MatchRepository;
import com.stallionscc.springboot.repository.TournamentRepository;

@RestController
@RequestMapping("api/tournamentMatchdetail")
public class MatchController {

	@Autowired
	private TournamentRepository tournamentRepository;
	
	@Autowired
	private MatchRepository matchRepository;
	
	@PostMapping("/save")
	public Tournament createNewTournament(@RequestBody TournamentMatchDetail tournamentMatchDetail) {
		return tournamentRepository.save(tournamentMatchDetail.getTournament());
	}
	
	
	@GetMapping
	public List<Tournament> findAllTournamentDetail(){
		return tournamentRepository.findAll();
	}
}
