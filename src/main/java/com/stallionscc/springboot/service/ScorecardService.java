package com.stallionscc.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.StallionsScorecard;
import com.stallionscc.springboot.repository.ScorecardRepository;

@Repository
@Transactional
public class ScorecardService {

	private List<StallionsScorecard> result;
	
	@PersistenceContext
	private EntityManager entityManager;
	 
	@Autowired
	private ScorecardRepository scorecardRepository;

	public List<StallionsScorecard> savestallionsscorecard(ScoreCardDetail scorecardDetail) {
		for (StallionsScorecard result : scorecardDetail.getStallionsscorecard()) {
			entityManager.persist(result);
		}
		return null;
	}

}
