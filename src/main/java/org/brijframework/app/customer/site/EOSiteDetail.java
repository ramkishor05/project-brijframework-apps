package org.brijframework.app.customer.site;

import java.sql.Timestamp;

import javax.persistence.Entity;

import org.brijframework.model.ModelBean;


@Entity
public class EOSiteDetail implements ModelBean {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Integer extension;
	public String timezone;
	public int rangeRadius;
	public Timestamp lastAccessedAt;
	
}
