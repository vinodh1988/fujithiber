package com.run;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.model.Person;
import com.utils.SessionFactoryProvider;

public class HibernateMain {
     public static void main(String n[]) {
    	 SessionFactory sf=SessionFactoryProvider.getSessionFactory();
    	 Session s=sf.openSession();
    	// Query q=s.createQuery("from Person where city='Mumbai'");
    	// List<Person> l=q.list();
    	 Criteria q=s.createCriteria(Person.class);
    	 Criterion c1= Restrictions.like("city","M%");
    	 Criterion c2=Restrictions.ge("sno", 4);
    	 q.add(c1);q.add(c2);
    	 List<Person> l=q.list();
    	 for(Person p:l)
    		 System.out.println(p.getSno()+" "+p.getName()+" "+p.getCity());
    	/* Transaction t=s.beginTransaction();
    	 Person p=new Person(2,"Kiran","Nagpur");
    	 s.saveOrUpdate(p);
    	 t.commit();
    	 System.out.println("ROW inserted");*/
    	 
    	 
    	 
     }
}
