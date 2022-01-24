package com.conan.vo;

public class Products {
	private String proId;
	private String proName;
	private Integer unitPrice;
	private String description;
	private String manufacturer;
	private String category;
	private Integer noOfStock;
	private String fileName;
	private Integer quantity;
	
	public Products() {
		
	}
	
	public Products(String proId, String proName, String description, Integer unitprice) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.description = description;
		this.unitPrice = unitprice;
	}
	
	public Products(String proId, String proName, Integer unitprice, String description, String manufacturer,
			String category, Integer noOfStock) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.unitPrice = unitprice;
		this.description = description;
		this.manufacturer = manufacturer;
		this.category = category;
		this.noOfStock = noOfStock;
	}
	
	public Products(String proId, String proName, Integer unitprice, String description, String manufacturer,
			String category, Integer noOfStock, String fileName) {
		super();
		this.proId = proId;
		this.proName = proName;
		this.unitPrice = unitprice;
		this.description = description;
		this.manufacturer = manufacturer;
		this.category = category;
		this.noOfStock = noOfStock;
		this.fileName = fileName;
	}
	
	public String getProId() {
		return proId;
	}
	public void setProId(String proId) {
		this.proId = proId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Integer getNoOfStock() {
		return noOfStock;
	}
	public void setNoOfStock(Integer noOfStock) {
		this.noOfStock = noOfStock;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	
}
