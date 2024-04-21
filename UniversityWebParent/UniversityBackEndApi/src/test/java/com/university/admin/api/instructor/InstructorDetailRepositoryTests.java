package com.university.admin.api.instructor;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import com.university.common.entity.InstructorDetail;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class InstructorDetailRepositoryTests {
	
	@Autowired
	private InstructorDetailRepository repository;
	
	
	@Disabled
	@Test
	void testCreateInstructorDetail()
	{
		//GIVEN 
		InstructorDetail instructorDetail = new InstructorDetail();
		instructorDetail.setHobby("Gym");
		instructorDetail.setYoutubeChannel("https://nirgym/ytube.com");
		
		
		//WHEN
		InstructorDetail saved = this.repository.save(instructorDetail);
		
		
		assertThat(saved).isNotNull();
		assertThat(saved.getId()).isGreaterThan(0);
	}
	
	@Test
	void testFindInstructorDetailById()
	{
		//GIVEN
		int id = 1; 
		Optional<InstructorDetail> instructorDetailOptional = this.repository.findById(id);
		
		assertThat(instructorDetailOptional.isPresent()).isTrue();
		
		System.out.println(instructorDetailOptional);
		
	}

}
