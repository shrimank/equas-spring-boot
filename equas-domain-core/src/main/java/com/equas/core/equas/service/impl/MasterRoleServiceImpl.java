/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.MasterRole;
import com.equas.core.equas.repository.MasterRoleRepository;
import com.equas.core.equas.service.MasterRoleService;

/**
 * @author shriman-dev
 *
 */
public class MasterRoleServiceImpl implements MasterRoleService {

	@Autowired
	private MasterRoleRepository masterRoleRepository;

	@Override
	public MasterRole save(MasterRole masterRole) {
		return masterRoleRepository.save(masterRole);
	}

	@Override
	public Optional<MasterRole> findById(Integer masterRoleId) {
		return masterRoleRepository.findById(masterRoleId);
	}

	@Override
	public Iterable<MasterRole> findAll() {
		return masterRoleRepository.findAll();
	}

	@Override
	public MasterRole update(MasterRole masterRole) {
		return masterRoleRepository.save(masterRole);
	}
}
