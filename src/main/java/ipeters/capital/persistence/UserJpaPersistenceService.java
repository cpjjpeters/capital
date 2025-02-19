package ipeters.capital.persistence;

import ipeters.capital.mapper.UserJpaDaoMapper;
import ipeters.capital.model.User;
import ipeters.capital.repository.UserJpaRepository;
import ipeters.capital.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/* carlpeters created on 19/02/2025 inside the package - ipeters.capital.persistence */
@Slf4j
@Service
@Primary
public class UserJpaPersistenceService  implements UserService {
    private final UserJpaRepository userJpaRepository;
    private final UserJpaDaoMapper userMapper;

    public UserJpaPersistenceService(UserJpaRepository userJpaRepository, UserJpaDaoMapper userMapper) {
        this.userJpaRepository = userJpaRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User save(User notice) {
        return userMapper.jpaEntityToModel( userJpaRepository.save(userMapper.modelToJpaEntity(notice)));
    }

    @Override
    public List<User> findAll() {
        return userJpaRepository.findAll()
                .stream()
                .map(userMapper::jpaEntityToModel)
                .toList();
    }

    @Override
    public Optional<User> findById(Long id) {
        return userJpaRepository.findById(id)
                .map(userMapper::jpaEntityToModel);
    }
}
