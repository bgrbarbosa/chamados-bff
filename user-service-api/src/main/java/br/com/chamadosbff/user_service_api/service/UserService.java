package br.com.chamadosbff.user_service_api.service;

import br.com.chamadosbff.hd_commons_lib.model.responses.UserResponse;
import br.com.chamadosbff.user_service_api.mapper.UserMapper;
import br.com.chamadosbff.user_service_api.model.User;
import br.com.chamadosbff.user_service_api.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository repository;

    private final UserMapper mapper;

    public List<UserResponse> findAll() {
        return repository.findAll()
                .stream().map(mapper::fromEntity)
                .toList();
    }


}
