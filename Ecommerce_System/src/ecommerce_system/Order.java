package ecommerce_system;
 
public class Order {
private int customerId;
private int orderId;
private Product[] products;
private float totalPrice;
public Order (){}
public Order(int customerId, int orderId, Product[] products, float totalPrice) {
this.customerId = Math.abs(customerId) ;
this.orderId = Math.abs(orderId);
this.products = products;
this.totalPrice =Math.abs(totalPrice) ; }

public void  printOrderInfo(){
System.out.println("Here's your order summary => ");
System.out.println("Order id : " + orderId);
System.out.println("Customer id : " + customerId);
System.out.println("Products => "); 
for (int i = 0; i < products.length; i++) {
if (products[i] != null) {
System.out.println(products[i].getName() + " - $" + products[i].getPrice()); } }
System.out.println("Total price: $" + totalPrice);}  
}
