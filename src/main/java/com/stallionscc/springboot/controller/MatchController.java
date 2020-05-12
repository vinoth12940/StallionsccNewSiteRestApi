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

import com.stallionscc.springboot.dto.MatchDetail;
import com.stallionscc.springboot.dto.TournamentDetail;
import com.stallionscc.springboot.entity.Matches;
import com.stallionscc.springboot.entity.Tournament;
import com.stallionscc.springboot.exception.ResourceNotFoundException;
import com.stallionscc.springboot.repository.MatchRepository;
import com.stallionscc.springboot.repository.TournamentRepository;

@RestController
@RequestMapping("api/matchDetail")
public class MatchController {

	List<Matches> myMatch;
	
	@Autowired
	private MatchRepository matchRepository;
	

	@PostMapping("/save")
	public Matches createNewMatch(@RequestBody MatchDetail matchDetail) {
		// System.out.println(matchDetail.toString());
		return matchRepository.save(matchDetail.getMatch());
	}

	@GetMapping
	public List<Matches> findAllMatchDetail() {
		return matchRepository.findAll();
	}

	@GetMapping("getallmatches/{id}")
	public List<Matches> getMatchBytournamentId(@PathVariable(value = "id") long tournament_id) {
		
		return matchRepository.getmatchesBytournamentId(tournament_id);
		// .orElseThrow(() -> new ResourceNotFoundException("No Matches detail found for
		// the tournament"));
	}

	@GetMapping("getmatch/{id}")
	public Matches getMatchBymatchId(@PathVariable(value = "id") long matchId) {
		return matchRepository.findById(matchId)
				.orElseThrow(() -> new ResourceNotFoundException("match Details not found" + matchId));
	}

	@PutMapping("updatematch/{id}")
	public Matches updateMatch(@RequestBody Matches match, @PathVariable("id") long match_id) {
		Matches existingMatch = this.matchRepository.findById(match_id)
				.orElseThrow(() -> new ResourceNotFoundException("Tournament not found with id :" + match_id));
		System.out.println(match);
		existingMatch.setBatting_first(match.getBatting_first());
		existingMatch.setGround_name(match.getGround_name());
		existingMatch.setIs_mom_stallions(match.getIs_mom_stallions());
		existingMatch.setIs_toss_stallions(match.getIs_toss_stallions());
		existingMatch.setIs_toss_stallions(match.getIs_toss_stallions());
		existingMatch.setIs_tournament_match(match.getIs_tournament_match());
		existingMatch.setMatch_date(match.getMatch_date());
		//existingMatch.setMatch_id(match.getMatch_id());
		existingMatch.setMatch_overs(match.getMatch_overs());
		existingMatch.setMatch_result(match.getMatch_result());
		existingMatch.setMatch_type(match.getMatch_type());
		existingMatch.setMom_player_name(match.getMom_player_name());
		existingMatch.setOpponent_team_name(match.getOpponent_team_name());
		existingMatch.setOpponent_total_overs(match.getOpponent_total_overs());
		existingMatch.setOpponent_total_runs(match.getOpponent_total_runs());
		existingMatch.setOpponent_total_wickets(match.getOpponent_total_wickets());
		existingMatch.setStallions_match_result(match.getStallions_match_result());
		existingMatch.setStallions_total_overs(match.getStallions_total_overs());
		existingMatch.setStallions_total_runs(match.getStallions_total_runs());
		existingMatch.setStallions_total_wickets(match.getStallions_total_wickets());
		return this.matchRepository.save(existingMatch);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Tournament> deleteMatch(@PathVariable("id") long match_id) {
		Matches existingMatch = this.matchRepository.findById(match_id)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found with id :" + match_id));
		this.matchRepository.delete(existingMatch);
		return ResponseEntity.ok().build();
	}

}
