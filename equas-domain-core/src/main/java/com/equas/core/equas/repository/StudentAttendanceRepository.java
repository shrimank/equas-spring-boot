/**
 * 
 */
package com.equas.core.equas.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.equas.core.equas.domain.StudentAttendance;

/**
 * @author shriman-dev
 *
 */
@Repository
public interface StudentAttendanceRepository extends CrudRepository<StudentAttendance, Integer> {

}
