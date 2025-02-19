package ipeters.capital.entity;

import ipeters.capital.config.OrderStatus;
import ipeters.capital.config.UserStatus;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

/* carlpeters created on 19/02/2025 inside the package - ipeters.capital.entity */
@Entity
@Table(name = "CPUSER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserJpaEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;
    @CreatedDate
    @Column(name = "CREATED_DATE")
    private Instant createdDate = Instant.now();
    @LastModifiedDate
    @Column(name = "LASTMODIFIED_DATE")
    private Instant lastModifiedDate = Instant.now();
    @Column
    private String userid;
    @Enumerated(EnumType.STRING)
    @Column(name = "USER_STATUS")
    private UserStatus userStatus;
}
