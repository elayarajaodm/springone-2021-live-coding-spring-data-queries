package com.greglturnquist.springbootlearning;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByName(String name);

    @Query("select e from Employee e where upper(e.name) like upper(concat('%', ?1, '%'))")
    List<Employee> findByNameContainingIgnoreCase(String partialMatch);

    List<Employee> findByManagerNameManagerNameManagerNameManagerName(String name, Pageable pageable);

}
