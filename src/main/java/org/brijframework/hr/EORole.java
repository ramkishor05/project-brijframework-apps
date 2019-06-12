package org.brijframework.hr;

import javax.persistence.Entity;

import org.brijframework.Role;
import org.brijframework.model.ModelBean;

@Entity
public class EORole implements ModelBean, Role{

	private static final long serialVersionUID = 1L;
	
    public int position;
	public String roleName;
	public String roleID;
	
	public boolean canDoAction(String actionID) {
		return false;
	}

	@Override
	public Object roleID() {
		return roleID;
	}
	
}

