package com.ashokit.mtm;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name = "tbl_books")
public class Book {
	@Id
	@Column(name = "Book_id")
	private Integer Book_id;
	@Column(name = "Book_Name")
   private String Book_Name;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "tbl_books_authors",
	joinColumns = @JoinColumn(name = "Book_Id",referencedColumnName= "book_id"),
	
	inverseJoinColumns = @JoinColumn(name = "author_Id",referencedColumnName= "author_id"))
   private List<Author> authors;
	public Integer getBook_id() {
		return Book_id;
	}
	public void setBook_id(Integer book_id) {
		Book_id = book_id;
	}
	public String getBook_Name() {
		return Book_Name;
	}
	public void setBook_Name(String book_Name) {
		Book_Name = book_Name;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

}
