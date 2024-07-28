package br.com.chamadosbff.user_service_api.repository;

import br.com.chamadosbff.user_service_api.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
