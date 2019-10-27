package io.nodom.employee.domain;

import java.time.LocalDate;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {

  @Id
  @Column(name = "emp_no")
  private Integer id;

  @Size(max = 14)
  @Column(name = "first_name", nullable = false)
  private String firstName;

  @Size(max = 16)
  @Column(name = "last_name", nullable = false)
  private String lastName;

  @Enumerated(EnumType.STRING)
  private Gender gender;

  @Column(name = "birth_date")
  private LocalDate birthDate;

  @Column(name = "hire_date")
  private LocalDate hireDate;

  @OneToMany(mappedBy = "employee")
  private Set<Salary> salaries;

  @OneToMany(mappedBy = "employee")
  private Set<Title> titles;

  @OneToMany(mappedBy = "employee")
  private Set<DepartManager> departManager;

  @OneToMany(mappedBy = "employee")
  private Set<DepartEmployee> departEmployee;
}
