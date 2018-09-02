package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.Contact;

/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface ContactService {

	Contact save(Contact contact);

	Contact update(Contact contact);

	Optional<Contact> findById(Integer contactId);

	Iterable<Contact> findAll();

}
