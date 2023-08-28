package org.dyonisia.repository


import org.dyonisia.entities.User
import org.springframework.data.jpa.repository.JpaRepository

public interface UserRepository extends JpaRepository<User, Long>{
}
