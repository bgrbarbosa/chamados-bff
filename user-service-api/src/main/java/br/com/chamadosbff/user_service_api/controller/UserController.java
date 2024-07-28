package br.com.chamadosbff.user_service_api.controller;


import br.com.chamadosbff.hd_commons_lib.model.request.CreateUserRequest;
import br.com.chamadosbff.hd_commons_lib.model.responses.UserResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequestMapping("/api/users")
public interface UserController {

    @GetMapping
    ResponseEntity<List<UserResponse>> findAll();

    @PostMapping
    ResponseEntity<Void> save(
            @Valid @RequestBody final CreateUserRequest createUserRequest
    );

}
