package com.stallionscc.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.stallionscc.springboot.entity.Matches;
import com.stallionscc.springboot.entity.OpponentExtra;
import com.stallionscc.springboot.entity.StallionsExtra;
import com.stallionscc.springboot.entity.Tournament;
import com.stallionscc.springboot.exception.ResourceNotFoundException;
import com.stallionscc.springboot.repository.OpponentTotalExtraRepository;
import com.stallionscc.springboot.repository.StallionsTotalExtraRepository;
import com.stallionscc.springboot.repository.TournamentRepository;

@RestController
@RequestMapping("api/totalextra")
public class ExtrasController {

	@Autowired
	StallionsTotalExtraRepository stallionstotalextraRepository;

	@Autowired
	OpponentTotalExtraRepository opponenttotalextraRepository;

	@PostMapping("/stallionstotalextra")
	public StallionsExtra insertStallionsExtra(@RequestBody StallionsExtra stallionsExtra) {

		return stallionstotalextraRepository.save(stallionsExtra);

	}

	@GetMapping("stallionstotalextra/{id}")
	public StallionsExtra getStallionsExtra(@PathVariable(value = "id") long matchId) {
		return this.stallionstotalextraRepository.findById(matchId)
				.orElseThrow(() -> new ResourceNotFoundException("No data found with id :" + matchId));

	}
	
	@PostMapping("/opponenttotalextra")
	public OpponentExtra insertOpponentExtra(@RequestBody OpponentExtra opponentExtra) {

		return opponenttotalextraRepository.save(opponentExtra);

	}

	@GetMapping("opponenttotalextra/{id}")
	public OpponentExtra getOpponentExtra(@PathVariable(value = "id") long matchId) {
		return this.opponenttotalextraRepository.findById(matchId)
				.orElseThrow(() -> new ResourceNotFoundException("No data found with id :" + matchId));

	}

	@PutMapping("opponenttotalextra/{id}")
	public OpponentExtra updateOpponentExtras(@RequestBody OpponentExtra opponentExtra, @PathVariable ("id") long match_id) {
		OpponentExtra existingOpponentExtra = this.opponenttotalextraRepository.findById(match_id)
			.orElseThrow(() -> new ResourceNotFoundException("Tournament not found with id :" + match_id));
		existingOpponentExtra.setExtras_byes(opponentExtra.getExtras_byes());
		existingOpponentExtra.setExtras_leg_byes(opponentExtra.getExtras_leg_byes());
		existingOpponentExtra.setExtras_no_balls(opponentExtra.getExtras_no_balls());
		existingOpponentExtra.setExtras_total_wides(opponentExtra.getExtras_total_wides());
		existingOpponentExtra.setId(opponentExtra.getId());
		existingOpponentExtra.setKey_note(opponentExtra.getKey_note());
		existingOpponentExtra.setMatch_id(opponentExtra.getMatch_id());
		existingOpponentExtra.setOpponent_total(opponentExtra.getOpponent_total());
		existingOpponentExtra.setTournament_id(opponentExtra.getTournament_id());
		 return this.opponenttotalextraRepository.save(existingOpponentExtra);
	}
	
	@PutMapping("stallionstotalextra/{id}")
	public StallionsExtra updateStallionsExtras(@RequestBody StallionsExtra stallionsExtra, @PathVariable ("id") long match_id) {
		StallionsExtra existingStallionsExtra = this.stallionstotalextraRepository.findById(match_id)
			.orElseThrow(() -> new ResourceNotFoundException("Tournament not found with id :" + match_id));
		existingStallionsExtra.setExtras_byes(stallionsExtra.getExtras_byes());
		existingStallionsExtra.setExtras_leg_byes(stallionsExtra.getExtras_leg_byes());
		existingStallionsExtra.setExtras_no_balls(stallionsExtra.getExtras_no_balls());
		existingStallionsExtra.setExtras_total_wides(stallionsExtra.getExtras_total_wides());
		existingStallionsExtra.setId(stallionsExtra.getId());
		existingStallionsExtra.setKey_note(stallionsExtra.getKey_note());
		existingStallionsExtra.setMatch_id(stallionsExtra.getMatch_id());
		existingStallionsExtra.setStallions_total(stallionsExtra.getStallions_total());
		existingStallionsExtra.setTournament_id(stallionsExtra.getTournament_id());
		 return this.stallionstotalextraRepository.save(existingStallionsExtra);
	}
	
	
	@DeleteMapping("stallionsextras/{id}")
	public ResponseEntity<StallionsExtra> deleteStallionsExtras(@PathVariable("id") long match_id) {
		StallionsExtra existingStallionsExtra = this.stallionstotalextraRepository.findById(match_id)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found with id :" + match_id));
		this.stallionstotalextraRepository.delete(existingStallionsExtra);
		return ResponseEntity.ok().build();
	}
	
	@DeleteMapping("opponentextras/{id}")
	public ResponseEntity<OpponentExtra> deleteOpponentExtras(@PathVariable("id") long match_id) {
		OpponentExtra existingOpponentExtra = this.opponenttotalextraRepository.findById(match_id)
				.orElseThrow(() -> new ResourceNotFoundException("Player not found with id :" + match_id));
		this.opponenttotalextraRepository.delete(existingOpponentExtra);
		return ResponseEntity.ok().build();
	}
}
