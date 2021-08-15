package com.example.empdet2.Entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.mapping.Set;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Department")

public class DepartmentEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 3308728889610662771L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dep_id")
    private Long depId;

    @Column(name = "dep_name")
    String depName;

    @Column(name = "dep_projects")
    String projects;

   // @OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
   // private Set<EmployeeEntity> employeeEntityList;

    //public <EmployeeEntity> getEmployeeEntityList() {
    //    return employeeEntityList;
   // }

    //public void setEmployeeEntityList(Set<EmployeeEntity> employeeEntityList) {
      //  this.employeeEntityList = employeeEntityList;
   // }
    //mapping relationships
}
