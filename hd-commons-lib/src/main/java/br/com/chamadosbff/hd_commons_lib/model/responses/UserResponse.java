package br.com.chamadosbff.hd_commons_lib.model.responses;

import br.com.chamadosbff.hd_commons_lib.model.ProfileEnum;


import java.io.Serial;
import java.io.Serializable;
import java.util.Set;

public record UserResponse(
    String id,
    String name,
    String email,
    String password,
    Set<ProfileEnum> profiles
) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
