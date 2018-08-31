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
@Table(name = "EQ_ADDRESS")
public class Address extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5055057493961941099L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "addressseq_generator")
	@SequenceGenerator(name = "addressseq_generator", sequenceName = "address_seq", allocationSize = 1)
	private Integer addressId;

	private String lineOne;

	private String lineTwo;

	private String city;

	private String state;

	private String country;

	private String zipPinCode;

}
