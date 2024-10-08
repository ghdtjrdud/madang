package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@Controller
public class BookController {
	
	@Autowired
	private BookService bs;
	
	@GetMapping("/book/insert")
	public void insertForm() {
		
	}
	
	@PostMapping("/book/insert")
	public String insertSubmit(Book b) {
		bs.insert(b);
		return "rediriect:/book/list";
	}
	
	public void list(Model model) {
		model.addAttribute("list",bs.findAll());
	}
	
	@GetMapping("/bbok/update")
	@ResponseBody
	public String update() {
		return "update";
	}

}
