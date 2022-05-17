package ai.jobiak.java8;

public class Product {
	
	private double productId;
	private String product;
	private String productCompany;
	private double productPrice;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(double productId, String product, String productCompany, double productPrice) {
		super();
		this.productId = productId;
		this.product = product;
		this.productCompany = productCompany;
		this.productPrice = productPrice;
	}

	public double getProductId() {
		return productId;
	}

	public void setProductId(double productId) {
		this.productId = productId;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public String getProductCompany() {
		return productCompany;
	}

	public void setProductCompany(String productCompany) {
		this.productCompany = productCompany;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", product=" + product + ", productCompany=" + productCompany
				+ ", productPrice=" + productPrice + "]";
	}
	
	

}
