package org.brijframework.app.customer;

import java.sql.Date;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.brijframework.Person;
import org.brijframework.hr.EOCustRole;
import org.brijframework.hr.EOCustUser;
import org.brijframework.lookup.EOAddress;

@Entity
public class EOCustomer extends Person {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String customerID;
	public String customerType;
	public Date registeredOnDate;
	
	@OneToMany(mappedBy = "eoCustomer")
	public Set<EOAddress> addressArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoCustomer")
	public Set<EOCustUser> eoCustUserArray = new LinkedHashSet<>();
	
	@OneToMany(mappedBy = "eoCustomer")
	public Set<EOCustRole> eoCustRoleArray = new LinkedHashSet<>();

	@OneToMany(mappedBy = "eoCustomer")
	public Set<EOCustApp> eoCustAppArray = new LinkedHashSet<>(); // Distinct apps purchased by customer
	
	@OneToMany(mappedBy = "eoCustomer")
	public Set<EOCustConcept>  eoCustConceptArray=new LinkedHashSet<>();

}
