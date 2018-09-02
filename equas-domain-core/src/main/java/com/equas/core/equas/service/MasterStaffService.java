package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.MasterStaff;
/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface MasterStaffService {

	
	MasterStaff save(MasterStaff masterStaff);

	MasterStaff update(MasterStaff masterStaff);

	Optional<MasterStaff> findById(Integer masterStaffId);

	Iterable<MasterStaff> findAll();

}
