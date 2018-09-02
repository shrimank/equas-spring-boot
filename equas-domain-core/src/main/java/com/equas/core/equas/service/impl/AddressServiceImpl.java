/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.Address;
import com.equas.core.equas.repository.AddressRepository;
import com.equas.core.equas.service.AddressService;

/**
 * @author shriman-dev
 *
 */
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressRepository addressRepository;

	@Override
	public Address save(Address address) {
		return addressRepository.save(address);
	}

	@Override
	public Optional<Address> findById(Integer addressId) {
		return addressRepository.findById(addressId);
	}

	@Override
	public Iterable<Address> findAll() {
		return addressRepository.findAll();
	}

	@Override
	public Address update(Address address) {
		return addressRepository.save(address);
	}

}
