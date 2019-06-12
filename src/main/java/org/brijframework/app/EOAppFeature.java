package org.brijframework.app;

import javax.persistence.Entity;

import org.brijframework.model.ModelBean;
@Entity
public class EOAppFeature implements ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String description;
	public double displayOrder;
	public String viewDetail;
}
