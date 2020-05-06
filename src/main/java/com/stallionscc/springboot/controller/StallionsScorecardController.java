package com.stallionscc.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.StallionsScorecard;
import com.stallionscc.springboot.repository.ScorecardRepository;
import com.stallionscc.springboot.service.ScorecardService;

@RestController
@RequestMapping("api/stallionsScorecard")
public class StallionsScorecardController {
	
	@Autowired
	private ScorecardService scorecardservice;
	
	@PostMapping("/save")
	public List<StallionsScorecard> createNewStallionsScorecard(@RequestBody ScoreCardDetail scorecardDetail) {
		return scorecardservice.savestallionsscorecard(scorecardDetail);
	}
}
