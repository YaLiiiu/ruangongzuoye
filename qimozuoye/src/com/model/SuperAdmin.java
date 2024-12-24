package com.model;

public class SuperAdmin {
	private Integer id;
	private String sname;
	private String spwd;

	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public String getSpwd() {
		return spwd;
	}


	public void setSpwd(String spwd) {
		this.spwd = spwd;
	}


	@Override
	public String toString() {
		return "Superadmin [id=" + id + ", sname=" + sname + ", spwd=" + spwd + "]";
	}


	
}