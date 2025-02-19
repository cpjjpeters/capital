package ipeters.capital.repository;

import ipeters.capital.entity.UserJpaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository  extends JpaRepository<UserJpaEntity, Long> {
}
