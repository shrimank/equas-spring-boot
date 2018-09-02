/**
 * 
 */
package com.equas.core.equas.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.equas.core.equas.domain.Lookup;

/**
 * @author shriman-dev
 *
 */
@Repository
public interface LookupRepository extends CrudRepository<Lookup, Integer> {
	
	Optional<List<Lookup>> findByCode(String lookupCode);

}
