package ipeters.capital.persistence;

import ipeters.capital.model.Notice;

import java.util.List;
import java.util.Optional;

public interface NoticePersistenceFacade {
    Notice save(Notice notice);
    List<Notice> findAll();
    Optional<Notice> findById(Long id);
    void delete(Notice notice);
    void deleteById(Long id);
    Notice update(Notice notice);
}
