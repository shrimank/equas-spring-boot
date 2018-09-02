package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.Address;

/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface AddressService {

	Address save(Address address);
	
	Address update(Address address);

	Optional<Address> findById(Integer addressId);

	Iterable<Address> findAll();

}
