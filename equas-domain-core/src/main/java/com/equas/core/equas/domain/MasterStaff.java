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
@Table(name = "EQ_MASTER_STAFF")
public class MasterStaff extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8761344491913591321L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "masterstaffseq_generator")
	@SequenceGenerator(name = "masterstaffseq_generator", sequenceName = "masterstaff_seq", allocationSize = 1)
	private Integer masterStaffId;

	@Column(unique = true, updatable = false)
	private String code;

	@ManyToOne
	@JoinColumn(referencedColumnName = "name", nullable = false)
	private MasterRole role;

	private String firstName;

	private String middleName;

	private String lastName;

	private String saluation;

	private String type;

	private String designation;

	private String qualification;

	private Gender gender;

	private Date dateOfBirth;

	private IdType idType;

	private String idValue;

	private Byte[] idImage;

	@ManyToOne
	@Column(nullable = false)
	private Contact contact;

	@ManyToOne
	@Column(nullable = false)
	private Address address;

}
