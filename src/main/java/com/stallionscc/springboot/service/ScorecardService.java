package com.stallionscc.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.StallionsScorecard;

@Repository
@Transactional
public class ScorecardService {
	
	@PersistenceContext
	private EntityManager entityManager;

	public List<StallionsScorecard> savestallionsscorecard(ScoreCardDetail scorecardDetail) {
		for (StallionsScorecard result : scorecardDetail.getStallionsscorecard()) {
			entityManager.persist(result);
		}
		return null;
	}

}
