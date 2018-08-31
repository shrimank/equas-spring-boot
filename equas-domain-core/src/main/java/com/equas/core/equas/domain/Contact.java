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
@Table(name = "EQ_CONTACT")
public class Contact extends AbstractEntity implements Serializable {


	/**
	 * 
	 */
	private static final long serialVersionUID = -6656100310952303685L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contactseq_generator")
	@SequenceGenerator(name = "contactseq_generator", sequenceName = "contact_seq", allocationSize = 1)
	private Integer contactId;

	private String primaryPhoneNo;

	private String secondaryPhoneNo;

	private String primaryEmailId;

	private String secondaryEmailId;

}
