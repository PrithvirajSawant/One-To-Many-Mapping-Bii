package com.jsp.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="person_info")
public class Person_Ab {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name="person_name")
	private String name;
	@Column(name="person_age")
	private int age;
	@Column(name="person_loc")
	private String loc;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Account_Ab> accounts;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public List<Account_Ab> getAccounts() {
		return accounts;
	}
	public void setAccounts(List<Account_Ab> accounts) {
		this.accounts = accounts;
	}
	
	
	
	

}
