package org.tnsif.placementmanagementrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.tnsif.placementmanagemententities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
