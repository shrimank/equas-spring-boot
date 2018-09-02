package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.MasterClass;
/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface MasterClassService {
	
	MasterClass save(MasterClass masterClass);

	MasterClass update(MasterClass masterClass);

	Optional<MasterClass> findById(Integer masterClassId);

	Iterable<MasterClass> findAll();

}
