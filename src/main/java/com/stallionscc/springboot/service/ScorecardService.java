package com.stallionscc.springboot.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stallionscc.springboot.dto.ScoreCardDetail;
import com.stallionscc.springboot.entity.StallionsScorecard;
import com.stallionscc.springboot.repository.ScorecardRepository;

@Service
public class ScorecardService {

	private List<StallionsScorecard> result;
	
	@Autowired
	private ScorecardRepository scorecardRepository;

	public List<StallionsScorecard> savestallionsscorecard(ScoreCardDetail scorecardDetail) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("TDEMSPU");
		EntityManager em = emf.createEntityManager();


	        em.getTransaction().begin(); 
	        
	     /*   List<Enquiry> tempEnqList = tempEnqList();
	        for (Iterator<Enquiry> it = tempEnqList.iterator(); it.hasNext();) {
	            Enquiry enquiry = it.next();

	            em.persist(enquiry);
	            em.flush();
	            em.clear();
	        }*/
	        
	        

	     

		System.out.println("In service" + scorecardDetail.getStallionsscorecard());

		for (StallionsScorecard result : scorecardDetail.getStallionsscorecard()) {
			
			em.persist(result);
			System.out.println(result.getPlayer_name());
			
			//scorecardRepository.save(result);
			System.out.println(result);
		}
		
		em.getTransaction().commit();
		em.close();

		return null;

	}

}
