package com.sharedpro.second.entity;

import java.io.Serializable;
import java.util.Objects;

public class EmployeeModelPk implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int eid;
	private int did;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	@Override
	public String toString() {
		return "EmployeeModelPk [eid=" + eid + ", did=" + did + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(did, eid);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeModelPk other = (EmployeeModelPk) obj;
		return did == other.did && eid == other.eid;
	}

}
