package ipeters.capital.persistence;

import ipeters.capital.model.CPOrder;

import java.util.List;

public interface CPOrderJpaPersistenceFacade {
    void save();

    List<CPOrder> findAll();
}
