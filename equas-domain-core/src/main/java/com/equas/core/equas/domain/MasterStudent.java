/**
 * 
 */
package com.equas.core.equas.domain;

import java.io.Serializable;

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
@Table(name = "EQ_MASTER_STUDENT")
public class MasterStudent extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8761344491913591321L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "masterstudentseq_generator")
	@SequenceGenerator(name = "masterstudentseq_generator", sequenceName = "masterstudent_seq", allocationSize = 1)
	@Column(unique=true)
	private Integer masterStudentId;

	private String firstName;

	private String middleName;

	private String lastName;

	private String gaurdianFirstName;

	private String gaurdianMiddleName;

	private String gaurdianLastName;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "code", nullable = false)
	private MasterClass classOrGrade;
	
	@ManyToOne
	@JoinColumn(referencedColumnName = "code", nullable = false)
	private MasterInstitute institute;

	@ManyToOne
	@Column(nullable = false)
	private Contact contact;

	@ManyToOne
	@Column(nullable = false)
	private Address address;

}
