package com.fasttrackit.pojo;

public class Workplace {

	private int id;
	private String name;
	private int cui;
	private String locatie;
	private int nrAnagajati;
	private String ceo;
	private String activitate;

	public Workplace() {

	}

	public Workplace(int id, String name, int cui, String locatie, int nrAnagajati, String ceo, String activitate) {
		super();
		this.id = id;
		this.name = name;
		this.cui = cui;
		this.locatie = locatie;
		this.nrAnagajati = nrAnagajati;
		this.ceo = ceo;
		this.activitate = activitate;
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

	public int getCui() {
		return cui;
	}

	public void setCui(int cui) {
		this.cui = cui;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public int getNrAnagajati() {
		return nrAnagajati;
	}

	public void setNrAnagajati(int nrAnagajati) {
		this.nrAnagajati = nrAnagajati;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	public String getActivitate() {
		return activitate;
	}

	public void setActivitate(String activitate) {
		this.activitate = activitate;
	}

}
