package org.brijframework.hr;

import java.sql.Timestamp;

import javax.persistence.Entity;

import org.brijframework.model.ModelBean;

@Entity
public class EOUserDetail implements ModelBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String userID;
	
	public String recoverID;
	
	public String securityCode;
	
	public Boolean isRemember;
	
	public Timestamp loggedInTime;
	
	public Timestamp lastAccessTime;
	
	public String remoteAddress;
	
	public String remoteHost;
	
}
