package com.example.tasklist.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.tasklist.model.User;

public interface UserRepository extends MongoRepository< User, String >
{
	
}
