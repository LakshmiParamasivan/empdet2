package com.example.empdet2.Controller;

import com.example.empdet2.Entity.DepartmentEntity;
import com.example.empdet2.Entity.EmployeeEntity;
import com.example.empdet2.Entity.EmployeeId;
import com.example.empdet2.Repository.DepartmentRepository;
import com.example.empdet2.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    private DepartmentRepository departmentRepository;
    @GetMapping(value = "/addEmployeedetails")
    public List<EmployeeEntity> addEmpDet()
    {
     return employeeRepository.findAll();
    }
   @GetMapping(value = "/employees/add/{depId}")
    public EmployeeEntity addPhoneNum(@PathVariable BigDecimal depId)
    {
        Optional<DepartmentEntity> optional = departmentRepository.findById(depId);
        EmployeeEntity entity=null;
        if (optional.isPresent())
        {
            entity=new EmployeeEntity();
            entity.setDoB(new Date());
            entity.setId(new EmployeeId());
            entity.setDepartment(optional.get());
            entity.setPhNum(BigDecimal.valueOf(12345));
        }

        return employeeRepository.save(entity);
    }
    @GetMapping(value = "/employees/add/{depId}")
    public List<EmployeeEntity> getEmployees(@PathVariable long depId)
    {
        return employeeRepository.findAllByDepartmentdepId(depId);
    }


}
