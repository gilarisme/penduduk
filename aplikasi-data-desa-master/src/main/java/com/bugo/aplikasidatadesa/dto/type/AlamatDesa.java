package com.bugo.aplikasidatadesa.dto.type;

public enum AlamatDesa {
	
	NGANCAR("Ngancar RT: 1/ RW: 1"), 
	PENJALIN("Penjalin RT: 2/ RW: 1"), 
	TAMBAK("Tambak RT:3/ RW:1"),
	KAMANDAWA("Kamandawa RT: 4/ RW: 1"),
	GAJAH("Gajah RT: 1/RW: 2"),
	MINTOROGO("Mintorogo RT: 2/RW: 2"),
	PONDOK("Pondok RT: 3/RW: 2"),
	KARANGPANAS("KarangPanas RT: 4/RW: 2")
	;
	
	private String description;
	
	private AlamatDesa(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}

}
