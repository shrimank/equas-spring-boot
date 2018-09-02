
package com.equas.core.equas.domain;

import java.util.Date;

import javax.persistence.Column;

import lombok.Data;

@Data
public abstract class AbstractEntity {

	@Column
	private Date _created_dt;

	@Column
	private Date _updated_dt;

	@Column
	private Date _deleted_dt;

	@Column
	private String _created_by;

	@Column
	private String _updated_by;

	@Column
	private String _deleted_by;

	@Column
	private Boolean isEnabled;

}
