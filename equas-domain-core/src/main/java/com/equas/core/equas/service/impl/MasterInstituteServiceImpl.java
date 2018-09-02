/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.MasterInstitute;
import com.equas.core.equas.repository.MasterInstituteRepository;
import com.equas.core.equas.service.MasterInstituteService;

/**
 * @author shriman-dev
 *
 */
public class MasterInstituteServiceImpl implements MasterInstituteService {

	@Autowired
	private MasterInstituteRepository masterInstituteRepository;

	@Override
	public MasterInstitute save(MasterInstitute masterInstitute) {
		return masterInstituteRepository.save(masterInstitute);
	}

	@Override
	public Optional<MasterInstitute> findById(Integer masterInstituteId) {
		return masterInstituteRepository.findById(masterInstituteId);
	}

	@Override
	public Iterable<MasterInstitute> findAll() {
		return masterInstituteRepository.findAll();
	}

	@Override
	public MasterInstitute update(MasterInstitute masterInstitute) {
		return masterInstituteRepository.save(masterInstitute);
	}
}
