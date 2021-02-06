package com.conde.demo.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;

@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String phone;
	private int idBook;
	private String businessLine;
	
	public Persona() {
		// TODO Auto-generated constructor stubs
	}

	public Persona(int id, String name, String phone, int idBook, String businessLine) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.idBook = idBook;
		this.businessLine = businessLine;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public int getIdBook() {
		return idBook;
	}

	public void setIdBook(int idBook) {
		this.idBook = idBook;
	}

	public String getBusinessLine() {
		return businessLine;
	}

	public void setBusinessLine(String businessLine) {
		this.businessLine = businessLine;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", name=" + name + ", phone=" + phone + ", idBook=" + idBook + ", businessLine="
				+ businessLine + "]";
	}

}
