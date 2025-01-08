package ipeters.capital.repository;

import ipeters.capital.entity.EmployeeJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeJpaEntity, Long> {
}
