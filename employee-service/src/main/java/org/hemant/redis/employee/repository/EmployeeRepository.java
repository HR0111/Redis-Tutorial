package org.hemant.redis.employee.repository;


import org.hemant.redis.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    Employee getEmployeeById(Long id);
}
