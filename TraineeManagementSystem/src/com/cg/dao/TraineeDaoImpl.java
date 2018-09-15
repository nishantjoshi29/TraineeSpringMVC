package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.cg.entities.Trainee;
@Repository
public class TraineeDaoImpl implements TraineeDao {
    @PersistenceContext
     EntityManager em;
	@Override
	public void addTrainee(Trainee trainee) {
		em.persist(trainee);
		
	}

	@Override
	public void deleteTrainee(Integer id) {
		
		Trainee trainee=em.find(Trainee.class, id);
		em.remove(trainee);
	}

	@Override
	public void modifyTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		em.merge(trainee);
	}

	@Override
	public Trainee retrieveTrainee(int id) {
		// TODO Auto-generated method stub
		return em.find(Trainee.class, id);
	}

	@Override
	public List<Trainee> retrieveAll(Trainee trainee) {
		// TODO Auto-generated method stub
		String jpql="select t from Trainee t";
		TypedQuery<Trainee> query=em.createQuery(jpql, Trainee.class);
		List<Trainee> trainees=query.getResultList();
		return trainees;
	}

}
