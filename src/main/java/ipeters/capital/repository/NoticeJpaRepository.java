package ipeters.capital.repository;

import ipeters.capital.entity.NoticeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeJpaRepository  extends JpaRepository<NoticeJpaEntity, Long> {
}
