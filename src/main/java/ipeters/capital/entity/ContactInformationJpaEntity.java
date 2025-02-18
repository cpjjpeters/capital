package ipeters.capital.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.time.Instant;

/* carlpeters created on 18/02/2025 inside the package - ipeters.capital.entity */
@Entity
@Table(name = "CONTACTINFORMATION")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContactInformationJpaEntity {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Column(name = "CONTACT_ID")
    private Long contactId;
    @CreatedDate
    @Column(name = "CREATED_DATE")
    private Instant createdDate = Instant.now();
    @LastModifiedDate
    @Column(name = "LASTMODIFIED_DATE")
    private Instant lastModifiedDate = Instant.now();
    @Column(name = "FIRSTNAME")
    private String firstName;
    @Column(name = "LASTNAME")
    private String lastName;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "PHONENUMBER")
    private String phoneNumber;
    @Column(name = "ADDRESS")
    private String address;
    @Column(name = "CITY")
    private String city;
    @Column(name = "STATE")
    private String state;
    @Column(name = "ZIP")
    private String zip;
    @Column(name = "COUNTRY")
    private String country;
    @Column(name = "CREATED_BY")
    private String orderCreatedBy;
    @Column(name = "USERID_LASTCHANGE")
    private String userIdLastChange;

}
