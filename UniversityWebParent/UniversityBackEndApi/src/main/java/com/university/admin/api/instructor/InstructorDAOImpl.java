package com.university.admin.api.instructor;

import org.springframework.stereotype.Repository;

import com.university.common.entity.Instructor;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
public class InstructorDAOImpl implements InstructorDAO {
	
	private EntityManager entityManager;

	public InstructorDAOImpl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	//IMPORTANT!! SINCE CASCASD TYPE = ALL -> THE DETAIL CHILD WILL BE SAVED!
	@Override
	@Transactional
	public void save(Instructor instructor) {
		
		this.entityManager.persist(instructor);
	} 
	
	
	
	
	
	

}
