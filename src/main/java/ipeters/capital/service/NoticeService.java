package ipeters.capital.service;

import ipeters.capital.mapper.NoticeJpaDaoMapper;
import ipeters.capital.model.Notice;
import ipeters.capital.persistence.facade.NoticePersistenceFacade;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

/* carlpeters created on 16/02/2025 inside the package - ipeters.capital.service */
@Slf4j
@Service
public class NoticeService {
    private final NoticePersistenceFacade noticePersistenceFacade;
    private final NoticeJpaDaoMapper noticeJpaDaoMapper;;

    public NoticeService(NoticePersistenceFacade noticePersistenceFacade, NoticeJpaDaoMapper noticeJpaDaoMapper) {
        this.noticePersistenceFacade = noticePersistenceFacade;
        this.noticeJpaDaoMapper = noticeJpaDaoMapper;
    }
    public List<Notice> findAll() {
        return this.noticePersistenceFacade.findAll();
    }

    public Notice save(Notice notice) {
        return this.noticePersistenceFacade.save(notice);
    }
}
