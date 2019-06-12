package org.brijframework.app.customer.site;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.brijframework.app.customer.EOCustConcept;
import org.brijframework.app.customer.site.EOSiteDetail;
import org.brijframework.lookup.EOAddress;
import org.brijframework.model.ModelBean;

@Entity
public class EOSiteMain implements ModelBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String description;
	public String name;

	@ManyToOne
	@JoinColumn(name = "EOAddressID")
	public EOAddress eoAddress;

	@ManyToOne
	@JoinColumn(name = "EOSiteDetailID")
	public EOSiteDetail siteDetail;

	@ManyToOne
	@JoinColumn(name = "EOCustConceptID")
	public EOCustConcept eoCustConcept;
	
}
