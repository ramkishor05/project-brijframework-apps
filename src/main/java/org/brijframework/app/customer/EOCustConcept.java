package org.brijframework.app.customer;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.brijframework.app.customer.site.EOSiteMain;
import org.brijframework.model.ModelBean;
import org.brijframework.store.inventory.EOInvApp;

@Entity
public class EOCustConcept implements ModelBean{

	private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "EOCustomerID", nullable = false)
	public EOCustomer eoCustomer;
      
	@OneToMany(mappedBy="eoCustConcept")
	public Set<EOSiteMain> eoSiteArray=new LinkedHashSet<>();
	
	@OneToOne
	public EOInvApp eoInvApp;
	
}
