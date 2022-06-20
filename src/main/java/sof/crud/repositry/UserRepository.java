package sof.crud.repositry;


import org.springframework.data.jpa.repository.JpaRepository;
import sof.crud.model.User;


public interface UserRepository extends JpaRepository<User, Long> {

}

