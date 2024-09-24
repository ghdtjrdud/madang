package com.example.demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.dao.BookDAO;
import com.example.demo.entity.Book;
@Service
public class BookService {
	
	@Autowired
	private BookDAO bookDAO;
	
	public void insert(Book book) {
		bookDAO.save(book);
	}
	
	public List<Book> findAll(){
		return bookDAO.findAll();
	}
}