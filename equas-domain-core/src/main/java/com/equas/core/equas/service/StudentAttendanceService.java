package com.equas.core.equas.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.equas.core.equas.domain.StudentAttendance;
/**
 * 
 * @author shriman-dev
 *
 */
@Service
public interface StudentAttendanceService {

	StudentAttendance save(StudentAttendance studentAttendance);

	StudentAttendance update(StudentAttendance studentAttendance);

	Optional<StudentAttendance> findById(Integer studentAttendanceId);

	Iterable<StudentAttendance> findAll();
}
