package com.university.admin.api.instructor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.university.common.entity.Instructor;


@Repository
public interface InstructorRepository extends CrudRepository<Instructor,Integer> {

}
