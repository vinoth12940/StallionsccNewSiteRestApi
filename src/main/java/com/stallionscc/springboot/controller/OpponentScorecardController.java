package com.stallionscc.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.OpponentScorecard;
import com.stallionscc.springboot.entity.StallionsScorecard;
import com.stallionscc.springboot.service.OpponentScorecardService;


@RestController
@RequestMapping("api/OpponentScorecard")
public class OpponentScorecardController {

	@Autowired
	private OpponentScorecardService opponentScorecardService;
	
	@GetMapping("/{id}")
	public List<OpponentScorecard> getOpponentScorecard(@PathVariable(value = "id") long match_id){
		System.out.println("Inside controller");
		System.out.println(match_id);
		return opponentScorecardService.findAll(match_id);
	}
	
	@PostMapping("/save")
	public int createNewOpponentScorecard(@RequestBody ScoreCardDetail scorecardDetail) {
		return opponentScorecardService.saveOpponentcorecard(scorecardDetail);
	}
	
	@PutMapping("/{id}")
	public int updateOpponentscorecard(@RequestBody ScoreCardDetail scorecardDetail,
			@PathVariable("id") long match_id) {
		
		System.out.println("inside controller");
		
		int rowsUpdated = 0;

		System.out.println("inside service");
		List<OpponentScorecard> stccscr = opponentScorecardService.findAll(match_id);

		System.out.println("Fetching" +stccscr);
		
		if (stccscr != null) {
			System.out.println("inside service id condition");
			int deletedRows = opponentScorecardService.delete(stccscr);
			System.out.println("Deleted Rows" + deletedRows);
			if (deletedRows > 0) {
				System.out.println("inside service if condition after delete check");
				rowsUpdated = opponentScorecardService.saveOpponentcorecard(scorecardDetail);
				System.out.println("inside service if condition after save scorecard");
			} else {
				return 0;
			}
		} else {
			rowsUpdated = opponentScorecardService.saveOpponentcorecard(scorecardDetail);
		}

		return rowsUpdated;
	}

	@DeleteMapping("/{id}")
	public int deleteStallionsscorecard(@PathVariable("id") long matchid) {
		List<OpponentScorecard> existingStallionsscorecard = this.opponentScorecardService.findAll(matchid);
		int rowsDeleted=this.opponentScorecardService.delete(existingStallionsscorecard);
		return rowsDeleted;
	
	}
	
	
}
