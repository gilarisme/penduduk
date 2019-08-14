package com.bugo.aplikasidatadesa.util;

import com.bugo.aplikasidatadesa.dto.type.AlamatDesa;

public class PendudukUtil {
	
	public static String getAlamatDesaDesc(String alamatDesaRequest) {
		Integer lookupAlamatDesa = Integer.parseInt(alamatDesaRequest);
		String alamatDesa = null;
		switch (lookupAlamatDesa) {
		  case 1:
			  alamatDesa = AlamatDesa.NGANCAR.getDescription();
		    break;
		  case 2:
			  alamatDesa = AlamatDesa.PENJALIN.getDescription();
		    break;
		  case 3:
			  alamatDesa = AlamatDesa.TAMBAK.getDescription();
		    break;
		  case 4:
			  alamatDesa = AlamatDesa.KAMANDAWA.getDescription();
		    break;
		  case 5:
			  alamatDesa = AlamatDesa.MINTOROGO.getDescription();
		    break;
		  case 6:
			  alamatDesa = AlamatDesa.GAJAH.getDescription();
		    break;
		  case 7:
			  alamatDesa = AlamatDesa.KARANGPANAS.getDescription();
		    break;
		  default:
			 break; 
		}		
		
		return alamatDesa;
	}
	
	

}
