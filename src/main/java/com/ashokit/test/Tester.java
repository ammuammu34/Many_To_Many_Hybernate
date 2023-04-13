package com.ashokit.test;

import java.util.Arrays;
import java.util.List;

import com.ashokit.daoimpl.BookDAOImpl;
import com.ashokit.dto.BookDAO;
import com.ashokit.mtm.Author;
import com.ashokit.mtm.Book;

import javassist.bytecode.SignatureAttribute.ArrayType;

public class Tester {

	public static void main(String[] args) {

		BookDAO dao = new BookDAOImpl();
		Book b1 = new Book();
		b1.setBook_id(101);
		b1.setBook_Name("java");
		
		Book b2 = new Book();
		b2.setBook_id(102);
		b2.setBook_Name("core");
		Book b3 = new Book();
		b3.setBook_id(103);
		b3.setBook_Name("Advance");
		Author a1 = new Author();
		a1.setAuthor_Id(110);
		a1.setAuthor_Name("jhonson");
		Author a2 = new Author();
		a2.setAuthor_Id(111);
		a2.setAuthor_Name("kelvin");
		Author a3 = new Author();
		a3.setAuthor_Id(112);
		a3.setAuthor_Name("jakson");
		
   List<Author> authors_book1 = Arrays.asList(a1,a3);
   b1.setAuthors(authors_book1);
   List<Author> authors_book2 = Arrays.asList(a2,a3);
   b2.setAuthors(authors_book2);
   List<Author> authors_book3 = Arrays.asList(a1,a2);
   b3.setAuthors(authors_book3);
   dao.saveBook(b1);
   dao.saveBook(b2);
   dao.saveBook(b3);
	}

}
