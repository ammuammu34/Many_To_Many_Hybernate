package com.ashokit.mtm;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Author")
public class Author {
	@Id
	@Column(name = "Author_Id")
	private Integer Author_Id;
	@Column(name = "Author_Name")
	private String Author_Name;
	@ManyToMany(cascade = CascadeType.MERGE,mappedBy = "authors")
	
	private List<Book> books;
	public Integer getAuthor_Id() {
		return Author_Id;
	}
	public void setAuthor_Id(Integer author_Id) {
		Author_Id = author_Id;
	}
	public String getAuthor_Name() {
		return Author_Name;
	}
	public void setAuthor_Name(String author_Name) {
		Author_Name = author_Name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}

}
