package com.shoppingcart.shoppingcart.repository;

import com.shoppingcart.shoppingcart.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    // Custom query methods can be defined here if needed

    // For example, to find a user by username:
    Optional<Users> findByUserName(String userName);


    @Query(value = "SELECT * FROM users WHERE userId = :userId", nativeQuery = true)
    Users findUserByUserId(@Param("userId") String userId);


}
