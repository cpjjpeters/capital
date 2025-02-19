package ipeters.capital.persistence.facade;

import ipeters.capital.model.CPOrder;

import java.util.List;
import java.util.Optional;

public interface CPOrderJpaPersistenceFacade {
    CPOrder save(CPOrder cpOrder);

    List<CPOrder> findAll();

    Optional<CPOrder> findById(Long id);

    void delete();

    void deleteById();

    CPOrder update(CPOrder cpOrder);
}
