package ipeters.capital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* carlpeters created on 16/02/2025 inside the package - ipeters.capital.repository */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "NOTICE")
public class NoticeJpaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long noticeId;
    @Column(name = "NOTICE_TYPE")
    private String noticeType;
    @Column(name = "NOTICE_NAME")
    private String noticeName;

}
