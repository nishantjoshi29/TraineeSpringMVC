package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Trainee")
public class Trainee {
  
    @Id
    @Column(name="traineeid")
    @NotNull(message="Id is mandatory")
	private Integer traineeId;
    @NotEmpty(message="Name is mandatory")
    @Column(name="traneename")
    private String traineeName;
    @NotEmpty(message="Domain is mandatory")
    @Column(name="traineedomain")  
    private String traineeDomain;
    @NotEmpty(message="Location is mandatory")
    @Column(name="traineelocation")
    private String traineeLocation;
    public Trainee(){
    	
    }
	public Integer getTraineeId() {
		return traineeId;
	}
	public void setTraineeId(Integer traineeId) {
		this.traineeId = traineeId;
	}
	public String getTraineeName() {
		return traineeName;
	}
	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}
	public String getTraineeDomain() {
		return traineeDomain;
	}
	public void setTraineeDomain(String traineeDomain) {
		this.traineeDomain = traineeDomain;
	}
	public String getTraineeLocation() {
		return traineeLocation;
	}
	public void setTraineeLocation(String traineeLocation) {
		this.traineeLocation = traineeLocation;
	}
	@Override
	public String toString() {
		return "Trainee [traineeId=" + traineeId + ", traineeName="
				+ traineeName + ", traineeDomain=" + traineeDomain
				+ ", traineeLocation=" + traineeLocation + "]";
	}
    

}
