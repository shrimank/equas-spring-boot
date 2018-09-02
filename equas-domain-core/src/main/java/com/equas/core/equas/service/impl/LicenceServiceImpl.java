package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.Licence;
import com.equas.core.equas.repository.LicenceRepository;
import com.equas.core.equas.service.LicenceService;

public class LicenceServiceImpl implements LicenceService {

	@Autowired
	private LicenceRepository licenceRepository;

	@Override
	public Licence save(Licence licence) {
		return licenceRepository.save(licence);
	}

	@Override
	public Optional<Licence> findById(Integer licenceId) {
		return licenceRepository.findById(licenceId);
	}

	@Override
	public Iterable<Licence> findAll() {
		return licenceRepository.findAll();
	}

	@Override
	public Licence update(Licence licence) {
		return licenceRepository.save(licence);
	}
}
