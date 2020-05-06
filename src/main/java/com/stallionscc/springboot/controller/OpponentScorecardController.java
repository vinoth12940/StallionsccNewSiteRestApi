package com.stallionscc.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.OpponentScorecard;
import com.stallionscc.springboot.service.OpponentScorecardService;


@RestController
@RequestMapping("api/OpponentScorecard")
public class OpponentScorecardController {

	@Autowired
	private OpponentScorecardService opponentScorecardService;
	
	@PostMapping("/save")
	public List<OpponentScorecard> createNewOpponentScorecard(@RequestBody ScoreCardDetail scorecardDetail) {
		return opponentScorecardService.saveOpponentcorecard(scorecardDetail);
	}
}
