package org.brijframework.lookup;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.brijframework.model.ModelBean;

@Entity
public class EOLKUnitConversion implements ModelBean{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public double baseQnt;
	
	public double rptQnt;
	
	public String typeID;
	
	@OneToOne
	@JoinColumn(name = "EOBaseUnitID", nullable = false)
	public EOLKUnit eoBaseUnit;
	
	@OneToOne
	@JoinColumn(name = "EORptUnitID", nullable = false)
	public EOLKUnit eoRptUnit;
}
