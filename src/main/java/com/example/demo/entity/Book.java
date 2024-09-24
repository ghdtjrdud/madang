package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
@Entity
@Table(name="book")
@Data
public class Book {
	private int no;
	private String title;
	private int price;
	private int qty;
	private String publisher;
	
}