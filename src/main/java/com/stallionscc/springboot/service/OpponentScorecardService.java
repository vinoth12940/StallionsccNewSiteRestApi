package com.stallionscc.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.OpponentScorecard;

@Repository
@Transactional
public class OpponentScorecardService {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<OpponentScorecard> saveOpponentcorecard(ScoreCardDetail scorecardDetail) {
		for (OpponentScorecard result : scorecardDetail.getOpponentScorecard()) {
			entityManager.persist(result);
		}
		return null;
	}

}
