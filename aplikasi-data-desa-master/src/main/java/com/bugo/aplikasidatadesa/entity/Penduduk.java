package com.bugo.aplikasidatadesa.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Loader;

import com.bugo.aplikasidatadesa.dto.type.AlamatDesa;

import lombok.Data;

@Entity
@Data
public class Penduduk {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;
	
	@Column(name="no_nik", nullable = false , unique = true)
	private Long noNik;
	
	@Column(name="nama")
	private String nama;
	
	@Column(name="tanggal_lahir")
	@Temporal(TemporalType.DATE)
	private Date tanggalLahir;
	
	@Column(name="tempat_lahir")
	private String tempatLahir;
	
	@Column(name="alamat_desa")
	private String alamatDesa;
	
	@Column(name="status")
	private String status;
	
	@Column(name="pekerjaan")
	private String pekerjaan;
	
	@Column(name="no_kk", nullable = false)
	private Long noKK;
	
	@Column(name="created_date")
	@Temporal(TemporalType.DATE)
	private Date createdDate;
	
	@Column(name="created_by")
	private String createdBy;
	
	
	
	
	
	
	
	
	
	

}
