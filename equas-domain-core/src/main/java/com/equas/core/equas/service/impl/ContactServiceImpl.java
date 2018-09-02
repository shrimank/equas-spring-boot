/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.Contact;
import com.equas.core.equas.repository.ContactRepository;
import com.equas.core.equas.service.ContactService;

/**
 * @author shriman-dev
 *
 */
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public Contact save(Contact contact) {
		return contactRepository.save(contact);
	}

	@Override
	public Optional<Contact> findById(Integer contactId) {
		return contactRepository.findById(contactId);
	}

	@Override
	public Iterable<Contact> findAll() {
		return contactRepository.findAll();
	}

	@Override
	public Contact update(Contact contact) {
		return contactRepository.save(contact);
	}
}
