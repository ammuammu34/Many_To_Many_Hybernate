package com.ashokit.daoimpl;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ashokit.dto.BookDAO;
import com.ashokit.mtm.Book;

public class BookDAOImpl implements BookDAO {
	private EntityManagerFactory factory = Persistence.createEntityManagerFactory("test");

	@Override
	public void saveBook(Book books) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
	t.begin();
	try {
		em.merge(books);
		t.commit();
		System.out.println("Book Is inserted...");
		
	}
	catch(Exception ex){
		t.rollback();
		ex.printStackTrace();
		
	}
	finally {
		em.close();
	}
	}

	@Override
	public void findBook(Integer bookId) {

		EntityManager em = factory.createEntityManager();
		Book book = em.find(Book.class,bookId);
		em.close();
		return;
	}

	@Override
	public void removeBook(Integer bookId) {

		EntityManager em = factory.createEntityManager();
		EntityTransaction t = em.getTransaction();
		t.begin();
		try {
			Book book = em.find(Book.class,bookId);
			em.remove(book);
			t.commit();
			System.out.println("BookIs Deleted...");
			return;
	}
		catch(Exception e) {
			

			t.rollback();
			e.printStackTrace();
	}
		finally {
			em.close();
		}
}
}


