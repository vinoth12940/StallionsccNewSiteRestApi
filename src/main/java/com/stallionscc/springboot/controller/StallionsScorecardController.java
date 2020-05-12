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

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.Matches;
import com.stallionscc.springboot.entity.StallionsScorecard;
import com.stallionscc.springboot.entity.Tournament;
import com.stallionscc.springboot.exception.ResourceNotFoundException;
import com.stallionscc.springboot.service.StallionScorecardService;

@RestController
@RequestMapping("api/stallionsScorecard")
public class StallionsScorecardController {

	@Autowired
	private StallionScorecardService stallionscorecardservice;

	@PostMapping("/save")
	public int createNewStallionsScorecard(@RequestBody ScoreCardDetail scorecardDetail) {
		return stallionscorecardservice.savestallionsscorecard(scorecardDetail);
	}

	@GetMapping("/{id}")
	public List<StallionsScorecard> getStallionScorecard(@PathVariable(value = "id") long match_id) {
		return stallionscorecardservice.findAll(match_id);
	}

	@PutMapping("/{id}")
	public int updateStallionsscorecard(@RequestBody ScoreCardDetail scorecardDetail,
			@PathVariable("id") long match_id) {
		
		System.out.println("inside controller");
		
		int rowsUpdated = 0;

		System.out.println("inside service");
		List<StallionsScorecard> stccscr = stallionscorecardservice.findAll(match_id);

		System.out.println("Fetching" +stccscr);

		if (stccscr != null) {
			System.out.println("inside service id condition");
			int deletedRows = stallionscorecardservice.delete(stccscr);
			System.out.println("Deleted Rows" + deletedRows);
			if (deletedRows > 0) {
				System.out.println("inside service if condition after delete check");
				rowsUpdated = stallionscorecardservice.savestallionsscorecard(scorecardDetail);
				System.out.println("inside service if condition after save scorecard");
			} else {
				return 0;
			}
		} else {
			rowsUpdated = stallionscorecardservice.savestallionsscorecard(scorecardDetail);
		}

		return rowsUpdated;
	}

	@DeleteMapping("/{id}")
	public int deleteStallionsscorecard(@PathVariable("id") long matchid) {
		List<StallionsScorecard> existingStallionsscorecard = this.stallionscorecardservice.findAll(matchid);
		int rowsDeleted=this.stallionscorecardservice.delete(existingStallionsscorecard);
		return rowsDeleted;
	}
}
