package com.springBootApk.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springBootApk.entities.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long>{

	

}
