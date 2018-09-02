package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.MasterRole;

/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface MasterRoleService {

	MasterRole save(MasterRole masterRole);

	MasterRole update(MasterRole masterRole);

	Optional<MasterRole> findById(Integer masterRoleId);

	Iterable<MasterRole> findAll();
}
