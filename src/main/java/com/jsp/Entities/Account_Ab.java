package com.jsp.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Accounts_info")
public class Account_Ab {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int acid;
	@Column(name="bankname")
	private String bankName;
	@Column(name="accountnum")
	private long acNum;
	@Column(name="bankaddress")
	private String address;
	@ManyToOne
    private Person_Ab persons;
    
	public int getAcid() {
		return acid;
	}
	public void setAcid(int acid) {
		this.acid = acid;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public long getAcNum() {
		return acNum;
	}
	public void setAcNum(long acNum) {
		this.acNum = acNum;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Person_Ab getPersons() {
		return persons;
	}
	public void setPersons(Person_Ab persons) {
		this.persons = persons;
	}
	
	
	
	
	

}
