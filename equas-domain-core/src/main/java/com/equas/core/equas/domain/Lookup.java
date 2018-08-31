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
@Table(name = "EQ_LOOKUP")
public class Lookup extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8761344491913591321L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "lookupseq_generator")
	@SequenceGenerator(name = "lookupseq_generator", sequenceName = "lookup_seq", allocationSize = 1)
	private Integer lookupId;

	private String code;

	private String value;

	private String value_1;

	private String value_2;

	private String value_3;

	private String value_4;

	private String value_5;

	private String value_6;

	private String description;

}
