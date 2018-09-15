package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.dao.TraineeDao;
import com.cg.entities.Trainee;
@Service
@Transactional
public class TraineeServiceImpl implements TraineeService {
    @Autowired
    TraineeDao tdao;
	@Override
	public void addTrainee(Trainee trainee) {
	tdao.addTrainee(trainee);
	}

	@Override
	public void deleteTrainee(Integer id) {
		tdao.deleteTrainee(id);
		
	}

	@Override
	public void modifyTrainee(Trainee trainee) {
		// TODO Auto-generated method stub
		tdao.modifyTrainee(trainee);
	}

	@Override
	public Trainee retrieveTrainee(int id) {
		// TODO Auto-generated method stub
		return tdao.retrieveTrainee(id);
	}

	@Override
	public List<Trainee> retrieveAll(Trainee trainee) {
		// TODO Auto-generated method stub
		return tdao.retrieveAll(trainee);
	}

}
