package ipeters.capital.repository;

import ipeters.capital.entity.ContactInformationJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactInformationJpaRepository extends JpaRepository<ContactInformationJpaEntity, Long> {
}
