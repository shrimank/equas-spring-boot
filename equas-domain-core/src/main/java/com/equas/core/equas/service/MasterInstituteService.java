package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.MasterInstitute;

/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface MasterInstituteService {

	MasterInstitute save(MasterInstitute masterInstitute);

	MasterInstitute update(MasterInstitute masterInstitute);

	Optional<MasterInstitute> findById(Integer masterInstituteId);

	Iterable<MasterInstitute> findAll();
}
