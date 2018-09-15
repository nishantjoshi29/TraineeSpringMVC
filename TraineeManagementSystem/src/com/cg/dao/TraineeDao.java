package com.cg.dao;

import java.util.List;

import com.cg.entities.Trainee;

public interface TraineeDao {
      public void addTrainee(Trainee trainee);
      public void deleteTrainee(Integer id);
      public void modifyTrainee(Trainee trainee);
      public Trainee retrieveTrainee(int id);
      public List<Trainee> retrieveAll(Trainee trainee);
}
