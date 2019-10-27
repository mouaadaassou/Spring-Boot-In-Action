package io.nodom.employee.domain;


import io.nodom.employee.domain.Title.TitleId;
import java.io.Serializable;
import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "titles")
@IdClass(TitleId.class)
public class Title {


  @Id
  @Column(name = "from_date")
  private LocalDate fromDate;

  @Id
  @Column(name = "to_date")
  private LocalDate toDate;

  @ManyToOne
  @JoinColumn(name = "emp_no")
  private Employee employee;

  private String title;

  @Data
  @AllArgsConstructor
  @NoArgsConstructor
  class TitleId implements Serializable {
    private LocalDate fromDate;
    private LocalDate toDate;
  }
}
