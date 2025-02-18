package ipeters.capital.service;

import ipeters.capital.mapper.CPOrderJpaDaoMapper;
import ipeters.capital.model.CPOrder;
import ipeters.capital.persistence.CPOrderJpaPersistenceFacade;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/* carlpeters created on 18/02/2025 inside the package - ipeters.capital.service */
@Slf4j
@Service
@AllArgsConstructor
public class CPOrderService {

    private final CPOrderJpaPersistenceFacade cpOrderJpaPersistenceFacade;
    private final CPOrderJpaDaoMapper cpOrderJpaDaoMapper;

    public void save() {
        this.cpOrderJpaPersistenceFacade.save();
    }

    public List<CPOrder> findAll() {
        return this.cpOrderJpaPersistenceFacade.findAll();
    }
}
