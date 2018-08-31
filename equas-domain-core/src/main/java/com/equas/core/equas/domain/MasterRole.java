/**
 * 
 */
package com.equas.core.equas.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author shriman-dev
 *
 */
@Data
@Entity
@Table(name = "EQ_MASTER_ROLE")
public class MasterRole extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7014372121998348693L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "masterroleseq_generator")
	@SequenceGenerator(name = "masterroleseq_generator", sequenceName = "masterrole_seq", allocationSize = 1)
	private Integer masterRoleId;

	private RoleType roleType;

	private String name;

	private String description;
}
