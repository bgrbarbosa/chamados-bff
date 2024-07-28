package br.com.chamadosbff.user_service_api.controller;


import br.com.chamadosbff.hd_commons_lib.model.request.CreateUserRequest;
import br.com.chamadosbff.hd_commons_lib.model.request.UpdateUserRequest;
import br.com.chamadosbff.hd_commons_lib.model.responses.UserResponse;
import io.swagger.v3.oas.annotations.Parameter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RequestMapping("/api/users")
public interface UserController {

    @GetMapping
    ResponseEntity<List<UserResponse>> findAll();

    @GetMapping("/{id}")
    ResponseEntity<UserResponse> findById(
            @Parameter(description = "User id", required = true, example = "64a2dc9d48a6a977cdca11c8")
            @PathVariable(name = "id") final String id
    );

    @PostMapping
    ResponseEntity<Void> save(
            @Valid @RequestBody final CreateUserRequest createUserRequest
    );

    @PutMapping("/{id}")
    ResponseEntity<UserResponse> update(
            @Parameter(description = "User id", required = true, example = "64a2dc9d48a6a977cdca11c8")
            @PathVariable(name = "id") final String id,
            @Valid @RequestBody final UpdateUserRequest updateUserRequest
    );

}
