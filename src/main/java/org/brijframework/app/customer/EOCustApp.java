package org.brijframework.app.customer;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.brijframework.app.EOAppMain;
import org.brijframework.hr.EOAppRole;
import org.brijframework.hr.EORole;
import org.brijframework.model.ModelBean;

@Entity
@Table(name = "EOCustApp", indexes = {
		@Index(name = "EOCustApp_Idx_cust_app", columnList = "EOCustomerID, EOAppMainID", unique = true),
		@Index(name = "EOCustApp_Idx_app", columnList = "EOAppMainID", unique = false) })
public class EOCustApp implements ModelBean {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Timestamp createdAt;

	@ManyToOne
	@JoinColumn(name = "EOCustomerID", nullable = false)
	public EOCustomer eoCustomer;

	@ManyToOne
	@JoinColumn(name = "EOAppMainID", nullable = false)
	public EOAppMain eoAppMain;

	public boolean isAccessed(EORole eoRole) {
		for (EOAppRole appRole : this.eoAppMain.eoAppRoleArray) {
			if (eoRole.position >= appRole.eoRole.position) {
				return true;
			}
		}
		return false;
	}

}
