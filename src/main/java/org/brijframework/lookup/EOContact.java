package org.brijframework.lookup;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.brijframework.model.ModelBean;

@Entity
public class EOContact implements ModelBean{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long contactID;
	
	@ElementCollection
	public List<Long> phoneArray=new ArrayList<>();
	@ElementCollection
	public List<String> emailArray=new ArrayList<>();
	@ElementCollection
	public List<Long> mobileArray=new ArrayList<>();
	@ElementCollection
	public List<String> faxArray=new ArrayList<>();
}
