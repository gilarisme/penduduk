package com.bugo.aplikasidatadesa.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

/*@Entity
@Data
public class KK {
	
	@Id
	@Column(name="no_kk", nullable = false , unique = true)
	private Long noKK;
	
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "materi")
	private List<Penduduk> anggotaKK = new ArrayList<>();
	

}
*/