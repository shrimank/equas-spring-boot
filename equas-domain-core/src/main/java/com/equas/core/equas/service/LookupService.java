package com.equas.core.equas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.Lookup;
/**
 * 
 * @author shriman-dev
 *
 */
public interface LookupService {
	
	Lookup save(Lookup lookup);

	Lookup update(Lookup lookup);

	Optional<Lookup> findById(Integer lookupId);

	Iterable<Lookup> findAll();
	
	//Non-Default methods
	Optional<List<Lookup>> findByCode(String lookupCode);

}
