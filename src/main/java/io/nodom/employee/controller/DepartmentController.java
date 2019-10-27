package io.nodom.employee.controller;

import io.nodom.employee.dto.DepartmentDTO;
import io.nodom.employee.mapper.DepartmentMapper;
import io.nodom.employee.repository.DepartmentRepository;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

  private final DepartmentRepository departmentRepository;
  private final DepartmentMapper departmentMapper;

  public DepartmentController(DepartmentRepository departmentRepository,
      DepartmentMapper departmentMapper) {
    this.departmentRepository = departmentRepository;
    this.departmentMapper = departmentMapper;
  }

  @GetMapping("/departments")
  public ResponseEntity<List<DepartmentDTO>> getAllDepartments() {
    return ResponseEntity.ok(this.departmentRepository.findAllDepartments().stream()
        .map(departmentMapper::mapDepartmentToDepartmentDTO).collect(Collectors.toList()));
  }
}
