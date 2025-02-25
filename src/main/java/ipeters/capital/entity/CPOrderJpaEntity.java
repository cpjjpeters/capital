package ipeters.capital.entity;

import ipeters.capital.config.OrderStatus;
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

/* carlpeters created on 17/02/2025 inside the package - ipeters.capital.entity */
@Entity
@Table(name = "CPORDER")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CPOrderJpaEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "ORDER_ID")
    private Long orderId;
    @CreatedDate
    @Column(name = "CREATED_DATE")
    private Instant createdDate = Instant.now();
    @LastModifiedDate
    @Column(name = "LASTMODIFIED_DATE")
    private Instant lastModifiedDate = Instant.now();
    private String orderType;
    @Enumerated(EnumType.STRING)
    @Column(name = "ORDER_STATUS")
    private OrderStatus orderStatus;
    @Column(name = "ORDER_AMOUNT")
    private String orderAmount;
    @Column(name = "ORDER_PRICE")
    private String orderPrice;
    @Column(name = "ORDER_TOTAL")
    private String orderTotal;
    @Column(name = "ORDER_FEE")
    private String orderFee;
    @Column(name = "CREATED_BY")
    private String orderCreatedBy;
    @Column(name = "USERID_LASTCHANGE")
    private String userIdLastChange;
}
