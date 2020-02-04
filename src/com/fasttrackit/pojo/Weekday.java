package com.fasttrackit.pojo;

public class Weekday {
	
	private int id;
	private String nume;
	private String prenume;
	private String functie;
	
	
	public Weekday() {
		
	}
	
	
	public Weekday(int id, String nume, String prenume, String functie) {
		super();
		this.id = id;
		this.nume = nume;
		this.prenume = prenume;
		this.functie = functie;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNume() {
		return nume;
	}
	public void setNume(String nume) {
		this.nume = nume;
	}
	public String getPrenume() {
		return prenume;
	}
	public void setPrenume(String prenume) {
		this.prenume = prenume;
	}
	public String getFunctie() {
		return functie;
	}
	public void setFunctie(String functie) {
		this.functie = functie;
	}
	
	
	
	
	
}
