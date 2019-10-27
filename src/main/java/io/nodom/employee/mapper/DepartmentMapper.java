package io.nodom.employee.mapper;

import io.nodom.employee.domain.Department;
import io.nodom.employee.dto.DepartmentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface DepartmentMapper {

  @Mapping(source = "id", target = "departmentId")
  DepartmentDTO mapDepartmentToDepartmentDTO(Department department);
}
