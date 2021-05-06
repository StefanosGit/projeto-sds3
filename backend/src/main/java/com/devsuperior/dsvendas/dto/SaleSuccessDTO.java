package com.devsuperior.dsvendas.dto;

import java.io.Serializable;

import com.devsuperior.dsvendas.entities.Seller;

public class SaleSuccessDTO implements Serializable{


	private static final long serialVersionUID = 950805808760525419L;
	
	private String sellerName;
	private Long visited;
	private Long deals;

	public SaleSuccessDTO() {
		
	}

	//se fosse no H2 podedia ser public SaleSumDTO (String sellerName, Double sum) {
	// mas para agragar no postges precisa usar o objeto da entity
	public SaleSuccessDTO(Seller seller, Long visited, Long deals) {

		this.sellerName = seller.getName();
		this.visited = visited;
		this.deals = deals;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Long getVisited() {
		return visited;
	}

	public void setVisited(Long visited) {
		this.visited = visited;
	}

	public Long getDeals() {
		return deals;
	}

	public void setDeals(Long deals) {
		this.deals = deals;
	}

	
	
	
	

}
