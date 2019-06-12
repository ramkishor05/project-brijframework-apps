package org.brijframework.hr;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.brijframework.app.customer.EOCustomer;
import org.brijframework.model.ModelBean;

@Entity
public class EOUser implements ModelBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public String username;

	public String password;

	public boolean rememberme;

	public String sessionID;

	@OneToOne
	@JoinColumn(name = "UserRole")
	public EORole eoRole;
	
	@OneToOne
	@JoinColumn(name = "UserDetail")
	public EOUserDetail eoUserDetail;

	@OneToOne
	@JoinColumn(name = "UserInfo")
	public EOUserInfo eoUserInfo;

	@ManyToOne
	@JoinColumn(name = "CustomerID")
	public EOCustomer eoCustomer;


}
