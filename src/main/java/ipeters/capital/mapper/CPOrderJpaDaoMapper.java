package ipeters.capital.mapper;

import ipeters.capital.entity.CPOrderJpaEntity;
import ipeters.capital.model.CPOrder;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CPOrderJpaDaoMapper {
    CPOrderJpaEntity modelToJpaEntity(CPOrder cpOrder);
    CPOrder jpaEntityToModel(CPOrderJpaEntity cpOrderJpaEntity);

}
