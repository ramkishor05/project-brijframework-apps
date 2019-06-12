package org.brijframework.store.crm;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.brijframework.lookup.EOAddress;
import org.brijframework.model.ModelBean;

@Entity
public class EOOrganization implements ModelBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy = GenerationType.AUTO)
	public String orgID;
	public String title;
	public String orgName;
	public String licen;
	public String orgType;

	@OneToMany(mappedBy = "eoOrganization")
	public Set<EOAddress> addressArray = new HashSet<>();
}
