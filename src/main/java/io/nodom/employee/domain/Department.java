package io.nodom.employee.domain;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "departments")
public class Department {

  @Id
  @Column(name = "dept_no")
  private String id;

  @Column(name = "dept_name")
  private String departmentName;

  @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
  private Set<DepartManager> departManager;

  @OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
  private Set<DepartEmployee> departEmployee;

}
