package org.brijframework.app.user;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.brijframework.app.EOAppMain;
import org.brijframework.hr.EORole;
import org.brijframework.model.ModelBean;


@Entity
public class EOAppRole implements ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
    public String appRoleID;
    
    public String appRoleName;
    
    public String appMenuID; 
    
    @ManyToOne
	@JoinColumn(name = "EORoleID", nullable = false)
	public EORole eoRole;

	@ManyToOne
	@JoinColumn(name = "EOAppMainID", nullable = false)
	public EOAppMain eoAppMain;
	
}
