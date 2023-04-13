package com.ashokit.dto;

import com.ashokit.mtm.Book;

public interface BookDAO {

	void saveBook(Book books);
	void findBook(Integer bookId);
	void removeBook(Integer bookId);
}
