package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.Licence;

/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface LicenceService {

	Licence save(Licence licence);

	Licence update(Licence licence);

	Optional<Licence> findById(Integer licenceId);

	Iterable<Licence> findAll();
}
