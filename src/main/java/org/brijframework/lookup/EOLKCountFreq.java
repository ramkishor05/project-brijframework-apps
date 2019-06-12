package org.brijframework.lookup;

import javax.persistence.Entity;

import org.brijframework.model.ModelBean;

@Entity
public class EOLKCountFreq implements ModelBean{

	private static final long serialVersionUID = 1L;
	
	public String typeID;
	public String name;
	public String description;
}
