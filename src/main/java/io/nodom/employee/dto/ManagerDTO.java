package io.nodom.employee.dto;

import java.time.LocalDate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ManagerDTO {

  private String managerName;
  private String department;
  private LocalDate fromDate;
  private LocalDate toDate;
}
