package com.umam.khairul.perpustakaan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="penerbit")
public class Penerbit {
	
	@Id @GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy = "uuid2")
	private String id;
	
	@Column(nullable = false , unique = true)
	@NotNull(message="Kode Tidak Boleh Kosong")
	@NotEmpty(message="Kode tidak Boleh Empty")
	private String code;
	
	@Column
	@NotNull(message="Nama Tidak Boleh Kosong")
	@NotEmpty(message="Nama tidak Boleh Empty")
	private String nama;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	

}
