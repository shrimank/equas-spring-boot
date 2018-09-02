/**
 * 
 */
package com.equas.core.equas.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.equas.core.equas.domain.StudentAttendance;
import com.equas.core.equas.repository.StudentAttendanceRepository;
import com.equas.core.equas.service.StudentAttendanceService;

/**
 * @author shriman-dev
 *
 */
public class StudentAttendanceServiceImpl implements StudentAttendanceService {

	@Autowired
	private StudentAttendanceRepository studentAttendanceRepository;

	@Override
	public StudentAttendance save(StudentAttendance studentAttendance) {
		return studentAttendanceRepository.save(studentAttendance);
	}

	@Override
	public Optional<StudentAttendance> findById(Integer studentAttendanceId) {
		return studentAttendanceRepository.findById(studentAttendanceId);
	}

	@Override
	public Iterable<StudentAttendance> findAll() {
		return studentAttendanceRepository.findAll();
	}

	@Override
	public StudentAttendance update(StudentAttendance studentAttendance) {
		return studentAttendanceRepository.save(studentAttendance);
	}
	
}
