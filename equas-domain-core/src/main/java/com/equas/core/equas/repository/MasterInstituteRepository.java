/**
 * 
 */
package com.equas.core.equas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.equas.core.equas.domain.MasterInstitute;

/**
 * @author shriman-dev
 *
 */
@Repository
public interface MasterInstituteRepository extends CrudRepository<MasterInstitute, Integer> {

}
