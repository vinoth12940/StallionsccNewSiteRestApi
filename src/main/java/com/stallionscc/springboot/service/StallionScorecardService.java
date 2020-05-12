package com.stallionscc.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.OpponentScorecard;
import com.stallionscc.springboot.entity.StallionsScorecard;
import com.stallionscc.springboot.entity.Tournament;
import com.stallionscc.springboot.exception.ResourceNotFoundException;

@Repository
@Transactional
public class StallionScorecardService {

	@PersistenceContext
	private EntityManager entityManager;

	StallionScorecardService stccscrservice;

	public int savestallionsscorecard(ScoreCardDetail scorecardDetail) {
		int rowCount = 0;
		for (StallionsScorecard result : scorecardDetail.getStallionsscorecard()) {
			entityManager.persist(result);
			rowCount++;
		}
		return rowCount;
	}

	public List<StallionsScorecard> findAll(long match_id) {
		System.out.println("Inside Service/Persist layer");
		Query query = entityManager.createQuery(
				"SELECT stccscr FROM StallionsScorecard stccscr WHERE stccscr.match_id = :match_id",
				StallionsScorecard.class);
		List<StallionsScorecard> stccscr = query.setParameter("match_id", match_id).getResultList();
		System.out.println("Query->" + query);
		System.out.println("List->" + query.getResultList());
		return stccscr;
	}

	/*
	 * public int updateStallionsScorecard(long match_id, ScoreCardDetail
	 * scorecardDetail) { int rowsUpdated = 0;
	 * 
	 * System.out.println("inside service"); List<StallionsScorecard> stccscr =
	 * stccscrservice.findAll(match_id);
	 * 
	 * System.out.println("Fetching" + stccscr);
	 * 
	 * if (stccscr != null) { System.out.println("inside service id condition"); int
	 * deletedRows = stccscrservice.delete(stccscr);
	 * System.out.println("Deleted Rows" + deletedRows); if (deletedRows > 0) {
	 * System.out.println("inside service if condition after delete check");
	 * rowsUpdated = stccscrservice.savestallionsscorecard(scorecardDetail);
	 * System.out.println("inside service if condition after save scorecard"); }
	 * else { return 0; } } else { rowsUpdated =
	 * stccscrservice.savestallionsscorecard(scorecardDetail); }
	 * 
	 * return rowsUpdated; }
	 */

	public int delete(List<StallionsScorecard> existingStallionsscorecard) {
		int rowsDeleted = 0;
		for (StallionsScorecard result : existingStallionsscorecard) {
			entityManager.remove(result);
			rowsDeleted++;
		}
		return rowsDeleted;
	}

}
