package multithreading;

public class Product {

	private int prodId;
	private String prodName;
	private double prodPrice;
	
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	@Override
	public String toString() {
		return  + prodId + " " + prodName + " " + prodPrice + "]";
	}
	
	@Override
	public int hashCode() {
		return (this.prodName.charAt(0));
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Product){
			Product parameter=(Product)obj;
			return this.prodName.equals(parameter.prodName);
		}
		return false;
	}
	

}
