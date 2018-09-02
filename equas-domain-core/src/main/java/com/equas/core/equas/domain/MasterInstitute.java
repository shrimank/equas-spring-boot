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
 *
 */
@Data
@Entity
@Table(name = "EQ_MASTER_INSTITUE")
public class MasterInstitute extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8761344491913591321L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "masterinstituteseq_generator")
	@SequenceGenerator(name = "masterinstituteseq_generator", sequenceName = "masterinstitute_seq", allocationSize = 1)
	private Integer masterinstituteId;

	private String code;

	private String type;

	private String name;

	@ManyToOne
	private Contact contact;

	@ManyToOne
	private Address address;

	@ManyToOne
	@JoinColumn(referencedColumnName = "code")
	private Licence licenceCode;

	private Date licenceExpDate;

}
