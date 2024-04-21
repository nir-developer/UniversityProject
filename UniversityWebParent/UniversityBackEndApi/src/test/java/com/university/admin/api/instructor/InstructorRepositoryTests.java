package com.university.admin.api.instructor;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.university.common.entity.Instructor;
import com.university.common.entity.InstructorDetail;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class InstructorRepositoryTests {
	
	@Autowired
	private InstructorRepository repository; 
	
	@Autowired
	TestEntityManager entityManager;
	
	@Test
	void testCreateInstructorWithInstructorDetail()
	{
		int id = 1; 
		InstructorDetail instructorDetail = entityManager.find(InstructorDetail.class, id);
		
		Instructor instructor = new Instructor("Nir", "Itzhak", "niritzhak@gmail.com");
		
		instructor.setInstructorDetail(instructorDetail);
		
		Instructor savedInstructor = this.repository.save(instructor);
		
		
		
		assertThat(savedInstructor).isNotNull();
		assertThat(savedInstructor.getId()).isGreaterThan(0);
		
		
		System.out.println(savedInstructor);
		
		
		
		//OK FOUND!! detail BY ENTITY MANAGE
//		InstructorDetail instructorDetail = this.entityManager.find(InstructorDetail.class, id);
//		assertThat(instructorDetail).isNotNull();
//		System.out.println(instructorDetail);
		
	}

}
