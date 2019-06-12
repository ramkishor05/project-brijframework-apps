package org.brijframework;

import java.sql.Date;

import javax.persistence.MappedSuperclass;

import org.brijframework.model.ModelBean;

@MappedSuperclass
public abstract class Person implements ModelBean{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String firstName;
    public String midName;
    public String lastName;
    public int age;
    public Date dob;
    public String gender;
}
