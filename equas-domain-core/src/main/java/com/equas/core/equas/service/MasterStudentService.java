package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.MasterStudent;
/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface MasterStudentService {

	
	MasterStudent save(MasterStudent masterStudent);

	MasterStudent update(MasterStudent masterStudent);

	Optional<MasterStudent> findById(Integer masterStudentId);

	Iterable<MasterStudent> findAll();
}
