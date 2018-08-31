package com.equas.core.equas.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "EQ_USERS")
public class Users extends AbstractEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -846993178790645840L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usersseq_generator")
	@SequenceGenerator(name = "usersseq_generator", sequenceName = "users_seq", allocationSize = 1)
	private Integer usersId;

	private String userName;

	private RoleType role;

	private String email;

	private String mobile;

	private String userPassword;

	private Boolean isEnabled;

	private Date lastLoginDate;

	@Column(columnDefinition = "default false")
	private Boolean passwordChanged;

}
