package io.nodom.employee.domain;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Manager {

  @Id
  @Column(name = "emp_no")
  private Integer id;

  @Column(name = "manager_name")
  private String managerName;

  @Column(name = "department")
  private String department;

  @Column(name = "from_date")
  private LocalDate fromDate;

  @Column(name = "to_date")
  private LocalDate toDate;
}
