package ipeters.capital.repository;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* carlpeters created on 16/02/2025 inside the package - ipeters.capital.repository */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class NoticeJpaEntity {
    @Id
    private Long noticeId;
    @Column(name = "NOTICE_TYPE")
    private String noticeType;
    @Column(name = "NOTICE_NAME")
    private String noticeName;

}
