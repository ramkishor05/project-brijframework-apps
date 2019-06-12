package org.brijframework.lookup;

import javax.persistence.Entity;

import org.brijframework.model.ModelBean;

@Entity
public class EOCurrency implements ModelBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String crnID;
	public String crnCode;
	public String discription;
}
