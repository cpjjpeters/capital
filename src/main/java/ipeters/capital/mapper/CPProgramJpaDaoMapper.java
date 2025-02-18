package ipeters.capital.mapper;

import ipeters.capital.entity.CPProgramJpaEntity;
import ipeters.capital.model.CPProgram;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CPProgramJpaDaoMapper {
    CPProgramJpaEntity modelToJpaEntity(CPProgram cpProgram);
    CPProgram jpaEntityToModel(CPProgramJpaEntity cpProgramJpaEntity);
}
