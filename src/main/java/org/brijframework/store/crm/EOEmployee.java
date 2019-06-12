package org.brijframework.store.crm;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.brijframework.Person;
import org.brijframework.lookup.EOAddress;

@Entity
public class EOEmployee extends Person {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int empID;
	public String empType;
	public String empCode;
	public Date startDate;
	public Date endDate;
	public String jobTitle;
	
	@OneToMany(mappedBy = "eoEmployee")
	public Set<EOAddress> addressArray = new HashSet<>();
	
}
