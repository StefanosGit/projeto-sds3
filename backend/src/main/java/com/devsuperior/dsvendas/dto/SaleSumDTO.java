package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSumDTO implements Serializable{


	private static final long serialVersionUID = 950805808760525419L;
	
	private String sellerName;
	private Double sum;
	
	public SaleSumDTO() {
		
	}

	//se fosse no H2 podedia ser public SaleSumDTO (String sellerName, Double sum) {
	// mas para agragar no postges precisa usar o objeto da entity
	public SaleSumDTO(Seller seller, Double sum) {
		super();
		this.sellerName = seller.getName();
		this.sum = sum;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
	
	
	
	
	
	
	
	
	

}
