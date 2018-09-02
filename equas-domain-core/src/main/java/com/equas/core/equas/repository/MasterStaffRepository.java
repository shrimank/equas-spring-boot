/**
 * 
 */
package com.equas.core.equas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.equas.core.equas.domain.MasterStaff;

/**
 * @author shriman-dev
 *
 */
@Repository
public interface MasterStaffRepository extends CrudRepository<MasterStaff, Integer> {

}
