package com.example.empdet2.Repository;

import com.example.empdet2.Entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Long> {
    List<EmployeeEntity> findAllByDepartmentdepId(long depId);
}
