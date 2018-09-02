/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.MasterStudent;
import com.equas.core.equas.repository.MasterStudentRepository;
import com.equas.core.equas.service.MasterStudentService;

/**
 * @author shriman-dev
 *
 */
public class MasterStudentServiceImpl implements MasterStudentService {

	@Autowired
	private MasterStudentRepository masterStudentRepository;

	@Override
	public MasterStudent save(MasterStudent masterStudent) {
		return masterStudentRepository.save(masterStudent);
	}

	@Override
	public Optional<MasterStudent> findById(Integer masterStudentId) {
		return masterStudentRepository.findById(masterStudentId);
	}

	@Override
	public Iterable<MasterStudent> findAll() {
		return masterStudentRepository.findAll();
	}

	@Override
	public MasterStudent update(MasterStudent masterStudent) {
		return masterStudentRepository.save(masterStudent);
	}
}
