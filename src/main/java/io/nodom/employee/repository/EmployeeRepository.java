package io.nodom.employee.repository;

import io.nodom.employee.domain.Manager;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EmployeeRepository extends JpaRepository<Manager, Integer> {

  @Query(value = "SELECT dept_manager.emp_no,"
      + "       concat_ws(' ', first_name, last_name) as manager_name,\n"
      + "       dept_name                             as department,\n"
      + "       from_date,\n"
      + "       to_date\n"
      + "FROM dept_manager\n"
      + "         INNER JOIN employees e on dept_manager.emp_no = e.emp_no\n"
      + "         INNER JOIN departments d on dept_manager.dept_no = d.dept_no\n"
      + "WHERE to_date = '9999-01-01'\n"
      + "ORDER BY dept_name;", nativeQuery = true)
  List<Manager> findAllManagers();
}
