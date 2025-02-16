package ipeters.capital.mapper;

import ipeters.capital.model.Notice;
import ipeters.capital.repository.NoticeJpaEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface NoticeJpaDaoMapper {
    NoticeJpaEntity modelToJpaEntity(Notice notice);
    Notice jpaEntityToModel(NoticeJpaEntity noticeJpaEntity);
}
