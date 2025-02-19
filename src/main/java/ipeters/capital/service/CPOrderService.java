package ipeters.capital.service;

import ipeters.capital.mapper.CPOrderJpaDaoMapper;
import ipeters.capital.model.CPOrder;
import ipeters.capital.persistence.facade.CPOrderJpaPersistenceFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/* carlpeters created on 18/02/2025 inside the package - ipeters.capital.service */
@Slf4j
@Service
public class CPOrderService {

    private final CPOrderJpaPersistenceFacade cpOrderJpaPersistenceFacade;
    private final CPOrderJpaDaoMapper mapper ;

    public CPOrderService(CPOrderJpaPersistenceFacade cpOrderJpaPersistenceFacade, @Qualifier("CPOrderJpaDaoMapper") CPOrderJpaDaoMapper mapper) {
        this.cpOrderJpaPersistenceFacade = cpOrderJpaPersistenceFacade;
        this.mapper = mapper;
    }


    public CPOrder   save(CPOrder cPOrder) {
        return this.cpOrderJpaPersistenceFacade.save(cPOrder);
    }

    public List<CPOrder> findAll() {
        return this.cpOrderJpaPersistenceFacade.findAll();
    }
}
