package org.brijframework.app;

import javax.persistence.Entity;

import org.brijframework.model.ModelBean;
@Entity
public class EOAppEdition implements ModelBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public double displayOrder;
	public String description;
	public double monthlyRate; 
	public int  startPayDay;
	public boolean isFreeEdition;
	public double version;
}
