package br.com.chamadosbff.user_service_api.mapper;


import br.com.chamadosbff.hd_commons_lib.model.responses.UserResponse;
import br.com.chamadosbff.user_service_api.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UserResponse fromEntity(final User entity);

}
