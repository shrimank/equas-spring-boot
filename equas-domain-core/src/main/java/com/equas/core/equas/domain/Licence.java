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
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

/**
 * @author shriman-dev
 *
 */
@Data
@Entity
@Table(name = "EQ_LICENCE")
public class Licence extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 162845475839966713L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "licenceseq_generator")
	@SequenceGenerator(name = "licenceseq_generator", sequenceName = "licence_seq", allocationSize = 1)
	private Integer licenceId;

	@Column(unique = true)
	private String code;

	private LicenceType type;

}

enum LicenceType {
	FREE, PAID;
}
