package com.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.workshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

}
