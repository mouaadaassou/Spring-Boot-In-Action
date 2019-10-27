package io.nodom.employee.repository;

import io.nodom.employee.domain.Department;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DepartmentRepository extends JpaRepository<Department, String> {

  @Query(value = "SELECT DISTINCT dept_no, dept_name FROM departments;", nativeQuery = true)
  List<Department> findAllDepartments();
}
