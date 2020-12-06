package com.accessingmysql;

import org.springframework.data.repository.CrudRepository;

import com.accessingmysql.UserPlaceVotes;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserPlaceVotesRepository extends CrudRepository<UserPlaceVotes, Integer> {

}