package org.tnsif.placementmanagementservices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.placementmanagemententities.Student;
import org.tnsif.placementmanagementrepository.StudentRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class StudentServices {
	
	
	@Autowired
	private StudentRepository repo;
	
	// for the addition/creation/insertation of new student
	void add(Student student)
	{
		repo.save(null);
	}
	
	
	//retrive with specific id
	void retrive(Integer id)
	{
		repo.findById(id).get();
	}
	
	//delete
	void delete(Integer id)
	{
		repo.deleteById(id);
	}
	
	
	//to retrive all the recored
	List<Student> retriveAll()
	{
		return repo.findAll();
	}
	
}
