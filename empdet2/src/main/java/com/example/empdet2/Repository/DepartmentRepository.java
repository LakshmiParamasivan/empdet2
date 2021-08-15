package com.example.empdet2.Repository;

import com.example.empdet2.Entity.DepartmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.Optional;

public interface DepartmentRepository extends JpaRepository<DepartmentEntity,Long> {
    Optional<DepartmentEntity> findById(BigDecimal depId);
}
