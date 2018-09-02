/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.MasterStaff;
import com.equas.core.equas.repository.MasterStaffRepository;
import com.equas.core.equas.service.MasterStaffService;

/**
 * @author shriman-dev
 *
 */
public class MasterStaffServiceImpl implements MasterStaffService {

	@Autowired
	private MasterStaffRepository masterStaffRepository;

	@Override
	public MasterStaff save(MasterStaff masterStaff) {
		return masterStaffRepository.save(masterStaff);
	}

	@Override
	public Optional<MasterStaff> findById(Integer masterStaffId) {
		return masterStaffRepository.findById(masterStaffId);
	}

	@Override
	public Iterable<MasterStaff> findAll() {
		return masterStaffRepository.findAll();
	}

	@Override
	public MasterStaff update(MasterStaff masterStaff) {
		return masterStaffRepository.save(masterStaff);
	}
}
