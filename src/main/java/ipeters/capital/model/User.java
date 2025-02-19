package ipeters.capital.model;

import ipeters.capital.config.UserStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/* carlpeters created on 13/02/2025 inside the package - ipeters.capital.model */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private Long id;
    private String userid;
    private UserStatus userStatus;

}
