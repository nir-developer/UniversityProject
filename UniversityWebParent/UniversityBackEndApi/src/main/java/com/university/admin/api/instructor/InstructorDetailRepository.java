package com.university.admin.api.instructor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.university.common.entity.InstructorDetail;


@Repository
public interface InstructorDetailRepository extends CrudRepository<InstructorDetail, Integer> {

}
