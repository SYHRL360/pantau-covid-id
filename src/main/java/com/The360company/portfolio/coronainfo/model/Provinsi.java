package com.The360company.portfolio.coronainfo.model;

import java.util.Map;

import javax.annotation.PostConstruct;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Provinsi {
	
	
	private int fid;
	
	private int kodeProvinsi;
	
	private String namaProvinsi;
	
	private int kasusPositive;
	
	private int kasusSembuh;
	
	private int kasusMeninggal;
	
	
	@JsonProperty("attributes")
	private void unpackNested(Map<String, Object> attributes) {
		this.fid = (int) attributes.get("FID");
		this.kodeProvinsi = (int) attributes.get("Kode_Provi");
		this.namaProvinsi = (String) attributes.get("Provinsi");
		this.kasusPositive = (int) attributes.get("Kasus_Posi");
		this.kasusSembuh = (int) attributes.get("Kasus_Semb");
		this.kasusMeninggal = (int) attributes.get("Kasus_Meni");
	}

	public int getFid() {
		return fid;
	}

	public void setFid(int fid) {
		this.fid = fid;
	}

	public int getKodeProvinsi() {
		return kodeProvinsi;
	}

	public void setKodeProvinsi(int kodeProvinsi) {
		this.kodeProvinsi = kodeProvinsi;
	}

	public String getNamaProvinsi() {
		return namaProvinsi;
	}

	public void setNamaProvinsi(String namaProvinsi) {
		this.namaProvinsi = namaProvinsi;
	}

	public int getKasusPositive() {
		return kasusPositive;
	}

	public void setKasusPositive(int kasusPositive) {
		this.kasusPositive = kasusPositive;
	}

	public int getKasusSembuh() {
		return kasusSembuh;
	}

	public void setKasusSembuh(int kasusSembuh) {
		this.kasusSembuh = kasusSembuh;
	}

	public int getKasusMeninggal() {
		return kasusMeninggal;
	}

	public void setKasusMeninggal(int kasusMeninggal) {
		this.kasusMeninggal = kasusMeninggal;
	}
	
	
	
	
	
}
