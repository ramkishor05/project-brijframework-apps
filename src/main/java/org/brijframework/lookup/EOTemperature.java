package org.brijframework.lookup;

import javax.persistence.Entity;

import org.brijframework.model.ModelBean;

@Entity
public class EOTemperature implements ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public String tempFormat; // temperature format
	public String nameFormat; // nameFormat
	
}
