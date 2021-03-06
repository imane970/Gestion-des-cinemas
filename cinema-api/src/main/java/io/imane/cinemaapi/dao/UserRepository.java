package io.imane.cinemaapi.dao;


import io.imane.cinemaapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface UserRepository extends JpaRepository<User, Long> {
}
