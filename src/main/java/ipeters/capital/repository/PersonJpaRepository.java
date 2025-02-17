package ipeters.capital.repository;

import ipeters.capital.entity.PersonJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonJpaRepository extends JpaRepository<PersonJpaEntity, Long> {
}
