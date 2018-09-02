/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.MasterClass;
import com.equas.core.equas.repository.MasterClassRepository;
import com.equas.core.equas.service.MasterClassService;

/**
 * @author shriman-dev
 *
 */
public class MasterClassServiceImpl implements MasterClassService {

	
	@Autowired
	private MasterClassRepository masterClassRepository;

	@Override
	public MasterClass save(MasterClass masterClass) {
		return masterClassRepository.save(masterClass);
	}

	@Override
	public Optional<MasterClass> findById(Integer masterClassId) {
		return masterClassRepository.findById(masterClassId);
	}

	@Override
	public Iterable<MasterClass> findAll() {
		return masterClassRepository.findAll();
	}

	@Override
	public MasterClass update(MasterClass masterClass) {
		return masterClassRepository.save(masterClass);
	}
}
