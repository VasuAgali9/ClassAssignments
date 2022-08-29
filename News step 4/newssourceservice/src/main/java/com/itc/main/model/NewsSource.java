package com.itc.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "NewsSourceService")
public class NewsSource {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int newssourceId;
	private String newssourcename;
	private String newssourceDesc;
	private String newssourceCreatedBy;
	public NewsSource() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsSource(int newssourceId, String newssourcename, String newssourceDesc, String newssourceCreatedBy) {
		super();
		this.newssourceId = newssourceId;
		this.newssourcename = newssourcename;
		this.newssourceDesc = newssourceDesc;
		this.newssourceCreatedBy = newssourceCreatedBy;
	}
	public int getNewssourceId() {
		return newssourceId;
	}
	public void setNewssourceId(int newssourceId) {
		this.newssourceId = newssourceId;
	}
	public String getNewssourcename() {
		return newssourcename;
	}
	public void setNewssourcename(String newssourcename) {
		this.newssourcename = newssourcename;
	}
	public String getNewssourceDesc() {
		return newssourceDesc;
	}
	public void setNewssourceDesc(String newssourceDesc) {
		this.newssourceDesc = newssourceDesc;
	}
	public String getNewssourceCreatedBy() {
		return newssourceCreatedBy;
	}
	public void setNewssourceCreatedBy(String newssourceCreatedBy) {
		this.newssourceCreatedBy = newssourceCreatedBy;
	}
	@Override
	public String toString() {
		return "NewsSource [newssourceId=" + newssourceId + ", newssourcename=" + newssourcename + ", newssourceDesc="
				+ newssourceDesc + ", newssourceCreatedBy=" + newssourceCreatedBy + "]";
	}
	
	

}
