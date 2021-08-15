package com.example.empdet2.Entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
@Getter
@Setter
public class EmployeeId implements Serializable {

  private static final long serialVersionUID = 7778440275789187201L;
  private long employeeId;

  @Column(name = "Emp_Name")
    private String employeeName;
}