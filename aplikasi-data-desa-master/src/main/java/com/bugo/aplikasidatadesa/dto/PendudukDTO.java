package com.bugo.aplikasidatadesa.dto;

import java.util.Date;

import lombok.Data;

@Data
public class PendudukDTO {
	
	private Long id;
	private Long noNik;
	private Long noKK;
	private String nama;
	private Date tanggalLahir;
	private String tempatLahir;
	private String alamatDesa;
	private String status;
	private String pekerjaan;
	

}
