package com.example.empdet2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Getter
@Setter
@Table(name = "Employee")
public class EmployeeEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = -1388040466380876559L;
    //private static final long serialVersionVid
   @EmbeddedId
   private EmployeeId id;

    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    //@Column(name = "dep_id")
    //private Long depId;

    //@Column(name = "emp_id")
  // private long employeeId;

   // @Column(name = "emp_name")
   //private String employeeName;

    @Column(name = "emp_phNo")
   private BigDecimal phNum;

    @Column(name = "emp_Dob")
    @Temporal(TemporalType.TIMESTAMP)
   private Date doB;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "dep_id" +
            "",nullable = false)
    private DepartmentEntity department;

  //  @OneToOne(fetch=FetchType.LAZY)
    //@JoinColumn(name="emp_id",nullable = false)
    //private DepartmentEntity department;
}
