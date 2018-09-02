package com.equas.core.equas.util;

import java.io.Serializable;

import lombok.Data;

/**
 * 
 * @author shriman-dev
 *
 */
@Data
public class EquasResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3023021455686039266L;

	private String status;

	private Object body;

	private String description;

}
