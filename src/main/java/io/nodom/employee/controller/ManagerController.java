package io.nodom.employee.controller;


import io.nodom.employee.dto.ManagerDTO;
import io.nodom.employee.mapper.ManagerMapper;
import io.nodom.employee.repository.EmployeeRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ManagerController {

  private final EmployeeRepository employeeRepository;
  private ManagerMapper managerMapper;

  public ManagerController(EmployeeRepository employeeRepository, ManagerMapper managerMapper) {
    this.employeeRepository = employeeRepository;
    this.managerMapper = managerMapper;
  }

  @GetMapping("/managers")
  public ResponseEntity<List<ManagerDTO>> getAllManagers() {
    return ResponseEntity.ok(this.employeeRepository.findAllManagers().stream()
        .map(managerMapper::mapManagerToManagerDTO).collect(
            Collectors.toList()));
  }
}
