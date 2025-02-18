package ipeters.capital.repository;

import ipeters.capital.entity.CPOrderJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CPOrderJpaRepository extends JpaRepository<CPOrderJpaEntity, Long> {
}
