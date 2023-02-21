package com.suninfotech.admin.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.suninfotech.admin.entity.AccountsMaster;

public interface AccountsMasterRepository extends MongoRepository<AccountsMaster, String> {

	Optional<AccountsMaster> findById(int id);

}
