package epjbuluran.minicapstone.service;

import epjbuluran.minicapstone.dto.UserDTO;
import epjbuluran.minicapstone.entity.UserEntity;
import epjbuluran.minicapstone.model.UserRequest;
import epjbuluran.minicapstone.repository.UserRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
}

    public UserDTO saveUser(@NonNull UserRequest newUser) throws IllegalAccessException {

        if (userRepository.findByEmail(newUser.getEmail()) != null) {
            throw new IllegalAccessException("Email already in used");
        }

        // Initalize user
        UserEntity user = UserEntity
                .builder()
                .userId(UUID.randomUUID())
                .email(newUser.getEmail())
                .password(newUser.getPassword())
                .totalOrders(0)
                .successOrders(0)
                .createdDate(datgeTimeUtil.currentDate())
                .modifiedDate(dateTimeUtil.curretDate())
                .build()

        // Save to Database
        userRepository.save(user);

        return null;
    }
}
