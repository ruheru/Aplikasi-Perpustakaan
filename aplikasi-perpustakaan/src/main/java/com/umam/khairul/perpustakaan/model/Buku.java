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
@Table
public class Buku {

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name="uuid", strategy="uuid2")
	private String id;
	
	@Column
	@NotEmpty @NotNull
	private String codePenerbit;
	
	@Column
	@NotEmpty @NotNull
	private String nama;
	
	@Column
	@NotEmpty @NotNull
	private Integer tahunTerbit;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCodePenerbit() {
		return codePenerbit;
	}

	public void setCodePenerbit(String codePenerbit) {
		this.codePenerbit = codePenerbit;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public Integer getTahunTerbit() {
		return tahunTerbit;
	}

	public void setTahunTerbit(Integer tahunTerbit) {
		this.tahunTerbit = tahunTerbit;
	}
}
