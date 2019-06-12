package org.brijframework.lookup;

import javax.persistence.Entity;

import org.brijframework.model.ModelBean;

@Entity
public class EOLKLanguage implements ModelBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String langID;
	public String langCode;
	public String discription;
}
