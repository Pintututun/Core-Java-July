package sortingOperationByimplementingComparableInterface;

public class Product implements Comparable<Product>{
private Integer productNumber;
private String productName;
private Double productPrice;
public Product(Integer productNumber, String productName, Double productPrice) {
	super();
	this.productNumber = productNumber;
	this.productName = productName;
	this.productPrice = productPrice;
}
protected Integer getProductNumber() {
	return productNumber;
}
protected void setProductNumber(Integer productNumber) {
	this.productNumber = productNumber;
}
protected String getProductName() {
	return productName;
}
protected void setProductName(String productName) {
	this.productName = productName;
}
protected Double getProductPrice() {
	return productPrice;
}
protected void setProductPrice(Double productPrice) {
	this.productPrice = productPrice;
}
public int compareTo(Product otherProduct)
{
	return -this.productName.compareTo(otherProduct.productName);
}
@Override
public String toString() {
	return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice=" + productPrice
			+ "]";
}

}
