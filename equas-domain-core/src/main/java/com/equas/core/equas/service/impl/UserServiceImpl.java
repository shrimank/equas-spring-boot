/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.Users;
import com.equas.core.equas.repository.UsersRepository;
import com.equas.core.equas.service.UserService;

/**
 * @author shriman-dev
 *
 */
public class UserServiceImpl implements UserService {

	@Autowired
	private UsersRepository userRepository;

	@Override
	public Users save(Users user) {
		return userRepository.save(user);
	}

	@Override
	public Optional<Users> findById(Integer userId) {
		return userRepository.findById(userId);
	}

	@Override
	public Iterable<Users> findAll() {
		return userRepository.findAll();
	}

	@Override
	public Users update(Users user) {
		return userRepository.save(user);
	}
}
