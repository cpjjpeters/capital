package ipeters.capital.persistence;

import ipeters.capital.entity.CPOrderJpaEntity;
import ipeters.capital.mapper.CPOrderJpaDaoMapper;
import ipeters.capital.model.CPOrder;
import ipeters.capital.persistence.facade.CPOrderJpaPersistenceFacade;
import ipeters.capital.repository.CPOrderJpaRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* carlpeters created on 18/02/2025 inside the package - ipeters.capital.persistence */
@Slf4j
@Service
public class CPOrderJpaPersistenceService implements CPOrderJpaPersistenceFacade {

    private final CPOrderJpaRepository repository;
    private final CPOrderJpaDaoMapper mapper;
    public CPOrderJpaPersistenceService(CPOrderJpaRepository repository, CPOrderJpaDaoMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public CPOrder save(CPOrder cpOrder) {
        log.debug("save CPOrder");
        CPOrderJpaEntity inter = mapper.modelToJpaEntity(cpOrder);
        CPOrderJpaEntity cpOrderJpaEntity = repository.save(inter);
        log.debug("saved {}", cpOrderJpaEntity);
        return this.mapper.jpaEntityToModel(cpOrderJpaEntity);
    }

    @Override
    public List<CPOrder> findAll() {
        return List.of();
    }

    @Override
    public Optional<CPOrder> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void delete() {

    }

    @Override
    public void deleteById() {

    }

    @Override
    public CPOrder update(CPOrder cpOrder) {
        return null;
    }
//
//    @Override
//    public void save() {
//        log.debug("save CPOrder");
//    }
//
//    @Override
//    public void findAll() {
//        log.debug("find all CPOrder");
//    }
//
//    @Override
//    public void findById(Long id) {
//        log.debug("find CPOrder by id: {}", id);
//    }
//
//    @Override
//    public void delete() {
//        log.debug("delete CPOrder");
//    }
//
//    @Override
//    public void deleteById(Long id) {
//        log.debug("delete CPOrder by id: {}", id);
//    }
//
//    @Override
//    public void update() {
//        log.debug("update CPOrder");
//    }
}
