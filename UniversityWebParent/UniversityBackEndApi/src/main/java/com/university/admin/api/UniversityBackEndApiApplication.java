package com.university.admin.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan({"com.university.common.entity", "com.university.api.admin.instructor"})
public class UniversityBackEndApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(UniversityBackEndApiApplication.class, args);
	}

	
	//SPRING WILL INJECT The CommondLine Dao for me(I must add @Configuration! NO NEED AUTOWIRED!
//	@Bean
//	public CommandLineRunner commandLineRunner(InstructorDAO instructorDAO)
//	{
//		return runner -> {
//			//System.out.println("Hello World");
//			createInstructor(instructorDAO);
//		};
//		
//	}
//	
//	private  void createInstructor(InstructorDAO instructorDAO)
//	{
//		//CREATE THE INSTRUCTOR
//		Instructor tempInstructor = new Instructor("Chad", "Darby", "darby@gmail.com"); 
//		
//		//CREATE THE INSTRUCTOR DETAIL 
//		InstructorDetail tempInstructorDetail =  new InstructorDetail("http://www.luv2code.com/ytube", "Luv 2 code!"); 
//		
//		
//		//ASSOCIATE THE 2 OBJECTS 
//		tempInstructor.setInstructorDetail(tempInstructorDetail);
//		
//		System.out.println("Saving Instructor: " + tempInstructor);
//		
//		//SAVE THE INSTRUCTOR - MUST APPLIED THE SAVE ON THE CHILD ALSO!  SINCE CASCAD ALL!
//		instructorDAO.save(tempInstructor);
//		
//		
//		System.out.println("DONE"); 
//		
//	}
}
