package io.nodom.employee.mapper;

import io.nodom.employee.domain.Manager;
import io.nodom.employee.dto.ManagerDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ManagerMapper {

  @Mapping(target = "managerName")
  ManagerDTO mapManagerToManagerDTO(Manager manager);
}
