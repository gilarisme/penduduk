package com.bugo.aplikasidatadesa.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bugo.aplikasidatadesa.dto.PendudukDTO;
import com.bugo.aplikasidatadesa.dto.type.AlamatDesa;
import com.bugo.aplikasidatadesa.entity.Penduduk;
import com.bugo.aplikasidatadesa.repository.PendudukRepository;
import com.bugo.aplikasidatadesa.util.ObjectMapperUtils;
import com.bugo.aplikasidatadesa.util.PendudukUtil;

@Service
public class PendudukServiceImpl implements PendudukService {
	
	@Autowired
	PendudukRepository pendudukRepository;

	@Override
	public void insert(PendudukDTO pendudukDTO) {
		Penduduk pendudukEntity  = ObjectMapperUtils.map(pendudukDTO, Penduduk.class);
		pendudukEntity.setAlamatDesa(PendudukUtil.getAlamatDesaDesc(pendudukDTO.getAlamatDesa()));
		pendudukEntity.setCreatedBy("admin");
		pendudukEntity.setCreatedDate(new Date());
		pendudukRepository.save(pendudukEntity);				
	}

	@Override
	public List<Penduduk> getAll() {
		return (List<Penduduk>) pendudukRepository.findAll();		
	}
	
	

}
