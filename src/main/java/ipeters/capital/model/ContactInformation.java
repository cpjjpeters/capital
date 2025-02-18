package ipeters.capital.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

/* carlpeters created on 18/02/2025 inside the package - ipeters.capital.model */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ContactInformation {
    private Long contactId;
    @Builder.Default
    private Instant createdDate = Instant.now();
    @Builder.Default
    private Instant lastModifiedDate = Instant.now();
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String country;
    private String userIdLastChange;
}
