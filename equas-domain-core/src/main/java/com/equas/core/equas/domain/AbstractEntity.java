
package com.equas.core.equas.domain;

import java.util.Date;

import lombok.Data;

@Data
public abstract class AbstractEntity {

	private Date _created_dt;

	private Date _updated_dt;

	private Date _deleted_dt;

	private String _created_by;

	private String _updated_by;

	private String _deleted_by;

	private boolean isEnabled;

}
