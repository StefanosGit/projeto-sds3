package com.devsuperior.dsvendas.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsvendas.dto.SaleDTO;
import com.devsuperior.dsvendas.dto.SaleSuccessDTO;
import com.devsuperior.dsvendas.dto.SaleSumDTO;
import com.devsuperior.dsvendas.sevices.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {
	
	@Autowired
	private SaleService service;
	
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pegeable){
		
		Page<SaleDTO> list = service.findAll(pegeable);
		return ResponseEntity.ok(list);
		
	}
	
	
	@GetMapping(value = "/sum-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		
		return ResponseEntity.ok(service.amountGroupedBySeller());
		
	}
	
	@GetMapping(value = "/sale-success")
	public ResponseEntity<List<SaleSuccessDTO>> successGroupedBySeller(){
		
		return ResponseEntity.ok(service.successGroupedBySeller());
		
	}
	

}
