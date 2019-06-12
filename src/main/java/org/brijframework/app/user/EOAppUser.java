package org.brijframework.app.user;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

import org.brijframework.hr.EONotification;
import org.brijframework.model.ModelBean;

@Entity
public class EOAppUser implements ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@OneToMany(mappedBy="eoAppUser")
	public Set<EONotification> eoNotificationArray=new LinkedHashSet<>();
}
