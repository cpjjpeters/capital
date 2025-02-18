package ipeters.capital.persistence;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/* carlpeters created on 18/02/2025 inside the package - ipeters.capital.persistence */
@Slf4j
@Service
public class CPOrderJpaPersistenceService implements CPOrderJpaPersistenceFacade {

    public CPOrderJpaPersistenceService() {
    }

    @Override
    public void save() {
        log.debug("save CPOrder");
    }

    @Override
    public void findAll() {
        log.debug("find all CPOrder");
    }

    @Override
    public void findById(Long id) {
        log.debug("find CPOrder by id: {}", id);
    }

    @Override
    public void delete() {
        log.debug("delete CPOrder");
    }

    @Override
    public void deleteById(Long id) {
        log.debug("delete CPOrder by id: {}", id);
    }

    @Override
    public void update() {
        log.debug("update CPOrder");
    }
}
