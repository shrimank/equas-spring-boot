/**
 * 
 */
package com.equas.core.equas.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author shriman-dev
 *
 */
@Data
@Entity
@Table(name = "EQ_STD_ATTENDANCE")
public class StudentAttendance extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4123723228212612596L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "stdattseq_generator")
	@SequenceGenerator(name = "stdattseq_generator", sequenceName = "stdatt_seq", allocationSize = 1)
	private Integer stdAttendanceId;

	@ManyToOne
	@JoinColumn(referencedColumnName = "masterStudentId", nullable = false)
	private MasterStudent studentId;

	private String name;

	private String subject;

	@ManyToOne
	@JoinColumn(referencedColumnName = "code", nullable = false)
	private MasterClass grade;

	@ManyToOne
	@JoinColumn(referencedColumnName = "code", nullable = false)
	private MasterStaff teacher;

	private Date attendanceDate;

	@Column(columnDefinition = "default false")
	private Boolean isPresent;

	private String remark;

	@Column(columnDefinition = "default false")
	private Boolean canSendSMS;

	@Column(columnDefinition = "default false")
	private Boolean canSendEmail;

}
