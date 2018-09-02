package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.Users;

/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface UserService {

	Users save(Users user);

	Users update(Users user);

	Optional<Users> findById(Integer userId);

	Iterable<Users> findAll();
}
