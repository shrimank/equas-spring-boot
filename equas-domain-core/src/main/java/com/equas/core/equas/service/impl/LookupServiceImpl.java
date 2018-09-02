/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.Lookup;
import com.equas.core.equas.repository.LookupRepository;
import com.equas.core.equas.service.LookupService;

/**
 * @author shriman-dev
 *
 */
@Service
public class LookupServiceImpl implements LookupService {

	@Autowired
	private LookupRepository lookupRepository;

	@Override
	public Lookup save(Lookup lookup) {
		return lookupRepository.save(lookup);
	}

	@Override
	public Optional<Lookup> findById(Integer lookupId) {
		return lookupRepository.findById(lookupId);
	}

	@Override
	public Iterable<Lookup> findAll() {
		return lookupRepository.findAll();
	}

	@Override
	public Lookup update(Lookup lookup) {
		return lookupRepository.save(lookup);
	}

	@Override
	public Optional<List<Lookup>> findByCode(String lookupCode) {
		return lookupRepository.findByCode(lookupCode);
	}
}
