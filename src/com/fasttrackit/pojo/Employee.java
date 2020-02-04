package com.fasttrackit.pojo;

public class Employee {

	private int id;
	private String nume;
	private String prenume;
	private String functie;
	private String dataNastere;
	private String dataAngajare;
	private String sex;
	private String email;
	private String nrtelefon;
	
	public Employee() {
		
	}

	public Employee(int id, String nume, String prenume, String functie, String dataNastere, String dataAngajare,
			String sex, String email, String nrtelefon) {
		super();
		this.id = id;
		this.nume = nume;
		this.prenume = prenume;
		this.functie = functie;
		this.dataNastere = dataNastere;
		this.dataAngajare = dataAngajare;
		this.sex = sex;
		this.email = email;
		this.nrtelefon = nrtelefon;
	}

	public Employee(int id, String nume, String prenume, String functie) {
		// TODO Auto-generated constructor stub
	}

	public Employee(String nume, String prenume, String functie) {
		// TODO Auto-generated constructor stub
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

	public String getDataNastere() {
		return dataNastere;
	}

	public void setDataNastere(String dataNastere) {
		this.dataNastere = dataNastere;
	}

	public String getDataAngajare() {
		return dataAngajare;
	}

	public void setDataAngajare(String dataAngajare) {
		this.dataAngajare = dataAngajare;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNrtelefon() {
		return nrtelefon;
	}

	public void setNrtelefon(String nrtelefon) {
		this.nrtelefon = nrtelefon;
	}
	
	
	
}
