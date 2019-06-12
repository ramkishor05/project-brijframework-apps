package org.brijframework.store.crm;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.brijframework.Person;
import org.brijframework.lookup.EOAddress;

@Entity
public class EOSupplier extends Person {

	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String supplierID;
	public String region;
	
	@OneToOne
	public EOOrganization eoOraganization;
	
	@OneToMany(mappedBy = "eoSupplier")
	public Set<EOAddress> addressArray = new LinkedHashSet<>();
}
