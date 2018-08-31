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
@Table(name = "EQ_MASTER_CLASS")
public class MasterClass extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6927617816912829199L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "mClassseq_generator")
	@SequenceGenerator(name = "mClassseq_generator", sequenceName = "mClass_seq", allocationSize = 1)
	private Integer mClassId;

	private String code;

	private String name;

	private String level;

	private String prefix;

	private String suffix;

	private String category;

}
