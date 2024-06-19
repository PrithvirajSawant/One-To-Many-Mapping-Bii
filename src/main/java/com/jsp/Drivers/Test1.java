package com.jsp.Drivers;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.Entities.Account_Ab;
import com.jsp.Entities.Person_Ab;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Account_Ab> list = new ArrayList<Account_Ab>();
		
		Account_Ab acc = new Account_Ab();
		acc.setBankName("SBI");
		acc.setAddress("Marathalli");
		acc.setAcNum(794223879);
		
		Account_Ab acc2 = new Account_Ab();
		acc2.setBankName("HDFC");
		acc2.setAddress("Bangalore");
		acc2.setAcNum(1267898719);
		
		Account_Ab acc3 = new Account_Ab();
		acc3.setBankName("Axis");
		acc3.setAddress("Mysore");
		acc3.setAcNum(319823879);
		
		list.add(acc);
		list.add(acc2);
		list.add(acc3);
		
		Person_Ab p = new Person_Ab();
		p.setName("Raj");
		p.setLoc("Bangalore");
		p.setAge(22);
		
		p.setAccounts(list);
		acc.setPersons(p);
		acc2.setPersons(p);
//		acc3.setPersons(p);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("simha");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction() ;
		et.begin();
//		em.persist(acc); //Commented as we are using Cascade.ALL
//		em.persist(acc2);
//		em.persist(acc3);
		em.persist(p);
		et.commit();

	}

}
