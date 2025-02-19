package ipeters.capital.mapper;

import ipeters.capital.entity.UserJpaEntity;
import ipeters.capital.model.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserJpaDaoMapper {
    UserJpaEntity modelToJpaEntity(User notice);
    User jpaEntityToModel(UserJpaEntity userJpaEntity);

}
