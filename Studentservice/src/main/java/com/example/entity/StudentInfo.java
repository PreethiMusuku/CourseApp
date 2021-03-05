package com.example.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="student")
public class StudentInfo {
 @Id
	private int stId;
	private String stName;
	private String qualification;
	private String mailid;
	private String password;
	@OneToMany(cascade = CascadeType.MERGE)
	@JoinColumn(name="student")
	private List<Course> registerdlist;
	public int getStId() {
		return stId;
	}
	public void setStId(int stId) {
		this.stId = stId;
	}
	public String getStName() {
		return stName;
	}
	public void setStName(String stName) {
		this.stName = stName;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<Course> getRegisterdlist() {
		return registerdlist;
	}
	public void setRegisterdlist(List<Course> registerdlist) {
		this.registerdlist = registerdlist;
	}
	@Override
	public String toString() {
		return "StudentInfo [stId=" + stId + ", stName=" + stName + ", qualification=" + qualification + ", mailid="
				+ mailid + ", password=" + password + ", registerdlist=" + registerdlist + "]";
	}
	public StudentInfo(int stId, String stName, String qualification, String mailid, String password,
			List<Course> registerdlist) {
		super();
		this.stId = stId;
		this.stName = stName;
		this.qualification = qualification;
		this.mailid = mailid;
		this.password = password;
		this.registerdlist = registerdlist;
	}
public StudentInfo() {
	
}
	
}
