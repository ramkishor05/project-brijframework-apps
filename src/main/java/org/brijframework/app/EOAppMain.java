package org.brijframework.app;

import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.brijframework.IAppMain;
import org.brijframework.hr.EOAppRole;
import org.brijframework.hr.EORole;
import org.brijframework.model.ModelBean;
import org.brijframework.support.model.Property;

@Entity
public class EOAppMain implements ModelBean, IAppMain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static final String INVERTORY = "INVERTORY_APP";

	public String appID;
	public String appName;
	public String appLogo;
	public String appURL;

	@Property
	@OneToOne
	public EOAppDetail appDetail;
	
	@Property
	@OneToOne
	public EOAppEdition appEdition;
	
	@Property
	@OneToOne
	public EOAppFeature appFeature;

	@OneToMany(mappedBy = "eoAppMain", fetch = FetchType.EAGER)
	@Property
	public Set<EOAppRole> eoAppRoleArray = new LinkedHashSet<>();


	public EOAppRole appRoleForRole(EORole eoRole) {
		for (EOAppRole appRole : this.eoAppRoleArray) {
			if (appRole.eoRole.roleID == eoRole.roleID) {
				return appRole;
			}
		}
		return null;
	}

	public boolean isInventory() {
		return INVERTORY.equals(this.appID);
	}
}
