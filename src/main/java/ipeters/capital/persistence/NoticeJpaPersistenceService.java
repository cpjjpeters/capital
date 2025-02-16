package ipeters.capital.persistence;

import ipeters.capital.mapper.NoticeJpaDaoMapper;
import ipeters.capital.model.Notice;
import ipeters.capital.repository.NoticeJpaEntity;
import ipeters.capital.repository.NoticeJpaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* carlpeters created on 16/02/2025 inside the package - ipeters.capital.persistence */
@Slf4j
@Service
public class NoticeJpaPersistenceService implements NoticePersistenceFacade{

    private final NoticeJpaRepository repository;
    private final NoticeJpaDaoMapper mapper;

    public NoticeJpaPersistenceService(NoticeJpaRepository repository, NoticeJpaDaoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Notice save(Notice notice) {
        log.debug("save notice: {}", notice);
        NoticeJpaEntity interNoticeJpaEntity = mapper.modelToJpaEntity(notice);
        NoticeJpaEntity noticeJpaEntity = repository.save(interNoticeJpaEntity);
        log.debug("save notice: {}", noticeJpaEntity);
        return this.mapper.jpaEntityToModel(noticeJpaEntity);
    }

    @Override
    public List<Notice> findAll() {
        return List.of();
    }

    @Override
    public Optional<Notice> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete(Notice notice) {

    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public Notice update(Notice notice) {
        return null;
    }
}
