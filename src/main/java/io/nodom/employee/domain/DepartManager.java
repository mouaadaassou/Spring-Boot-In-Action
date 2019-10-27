package io.nodom.employee.domain;

import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Immutable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "dept_manager")
@Immutable
public class DepartManager {

  @Data
  @Embeddable
  @NoArgsConstructor
  @AllArgsConstructor
  private static class Id implements Serializable {

    @Column(name = "emp_no")
    private Integer employeeId;

    @Column(name = "dept_no")
    private String departmentId;
  }


  @EmbeddedId
  private Id id = new Id();

  @Column(name = "from_date")
  private LocalDate fromDate;

  @Column(name = "to_date")
  private LocalDate toDate;

  @ManyToOne
  @JoinColumn(name = "emp_no", updatable = false, insertable = false)
  private Employee employee;

  @ManyToOne
  @JoinColumn(name = "dept_no", updatable = false, insertable = false)
  private Department department;
}
