package org.brijframework.app;

import javax.persistence.Entity;

import org.brijframework.model.ModelBean;
@Entity
public class EOAppDetail implements ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public double displayOrder;
	public String internalHost;
	public String externalHost;
	public String internalPort;
	public String externalPort;
}
