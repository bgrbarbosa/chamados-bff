package br.com.chamadosbff.user_service_api.controller.impl;

import br.com.chamadosbff.hd_commons_lib.model.responses.UserResponse;
import br.com.chamadosbff.user_service_api.controller.UserController;
import br.com.chamadosbff.user_service_api.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class UserControllerImpl implements UserController {

    private final UserService userService;

    @Override
    public ResponseEntity<List<UserResponse>> findAll() {
        return ResponseEntity.ok().body(userService.findAll());
    }


}
