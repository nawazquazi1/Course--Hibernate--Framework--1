package main.java.org.xml;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

		Person person = new Person(23, "Ram", "Delhi", "52524");

		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();

		session.save(person);

		tx.commit();
		session.close();

		factory.close();

	}

}
