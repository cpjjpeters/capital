package ipeters.capital.service;

/* carlpeters created on 19/02/2025 inside the package - ipeters.capital.service */

import ipeters.capital.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User save (User notice);
    List<User> findAll();
    Optional<User> findById(Long id);
}
