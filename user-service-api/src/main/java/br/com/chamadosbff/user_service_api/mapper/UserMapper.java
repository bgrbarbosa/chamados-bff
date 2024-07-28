package br.com.chamadosbff.user_service_api.mapper;


import br.com.chamadosbff.hd_commons_lib.model.request.CreateUserRequest;
import br.com.chamadosbff.hd_commons_lib.model.request.UpdateUserRequest;
import br.com.chamadosbff.hd_commons_lib.model.responses.UserResponse;
import br.com.chamadosbff.user_service_api.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import static org.mapstruct.NullValueCheckStrategy.ALWAYS;
import static org.mapstruct.NullValuePropertyMappingStrategy.IGNORE;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = IGNORE,
        nullValueCheckStrategy = ALWAYS
)
public interface UserMapper {

    UserResponse fromEntity(final User entity);

    @Mapping(target = "id", ignore = true)
    User fromRequest(CreateUserRequest createUserRequest);

    @Mapping(target = "id", ignore = true)
    User update(UpdateUserRequest updateUserRequest, @MappingTarget User entity);

}
