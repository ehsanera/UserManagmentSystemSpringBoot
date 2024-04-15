package com.ehsan.usermanagmentsystemspringboot.repository;

import com.ehsan.usermanagmentsystemspringboot.entity.Users;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends ReactiveCrudRepository<Users, Long> {

}
