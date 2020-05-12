package com.stallionscc.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.OpponentScorecard;
import com.stallionscc.springboot.entity.StallionsScorecard;

@Repository
@Transactional
public class OpponentScorecardService {

	@PersistenceContext
	private EntityManager entityManager;

	public int saveOpponentcorecard(ScoreCardDetail scorecardDetail) {
		int rowsInserted =0;
		for (OpponentScorecard result : scorecardDetail.getOpponentScorecard()) {
			entityManager.persist(result);
			rowsInserted++;
		}
		return rowsInserted;
	}

	/*
	 * public OpponentScorecard find(long id) { return entityManager.f }
	 */

	public List<OpponentScorecard> findAll(long match_id) {
		System.out.println("Inside Service/Persist layer");
		Query query = entityManager.createQuery("SELECT oppscr FROM OpponentScorecard oppscr WHERE oppscr.match_id = :match_id",
				OpponentScorecard.class);
		List<OpponentScorecard> oppscr = query.setParameter("match_id", match_id).getResultList();
		System.out.println("Query->" +query);
		System.out.println("List->"+ query.getResultList());
		return oppscr;
	}	
	
	
	public int delete(List<OpponentScorecard> existingOpponentscorecard) {
		int rowsDeleted = 0;
		for (OpponentScorecard result : existingOpponentscorecard) {
			entityManager.remove(result);
			rowsDeleted++;
		}
		return rowsDeleted;
	}

}
