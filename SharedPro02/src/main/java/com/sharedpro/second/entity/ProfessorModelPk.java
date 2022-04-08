package com.sharedpro.second.entity;
import java.io.Serializable;
import java.util.Objects;

public class ProfessorModelPk implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int pid;
	private int did;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public int getDid() {
		return did;
	}
	public void setDid(int did) {
		this.did = did;
	}
	@Override
	public int hashCode() {
		return Objects.hash(did, pid);
	}
	
	@Override
	public String toString() {
		return "ProfessorModelPk [pid=" + pid + ", did=" + did + "]";
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfessorModelPk other = (ProfessorModelPk) obj;
		return did == other.did && pid == other.pid;
	}
	
	

}
