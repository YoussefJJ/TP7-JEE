package com.example.tp7.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {
	public Product() {
	}
	public Product(Long id, String prodName, String prodDesc, String prodImage, Double prodPrice) {
		super();
		this.id = id;
		this.prodName = prodName;
		this.prodDesc = prodDesc;
		this.prodImage = prodImage;
		this.prodPrice = prodPrice;
	}
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public String getProdImage() {
		return prodImage;
	}
	public void setProdImage(String prodImage) {
		this.prodImage = prodImage;
	}
	public Double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(Double prodPrice) {
		this.prodPrice = prodPrice;
	}
	private String prodName;
	private String prodDesc;
	private String prodImage;
	private Double prodPrice;
	
}
