package ecommerce_system;

public class Cart {
private int CustomerId ;
private int nProducts;
private Product [] Products ; 

public Cart (){
this.nProducts = 0;
this.Products = new Product[10] ; }

public Cart(int CustomerId, int nProducts) {
this.CustomerId = Math.abs(CustomerId);
this.nProducts = Math.abs(nProducts);
this.Products = new Product[this.nProducts] ; }

public int getCustomerId() {
return CustomerId;}
public void setCustomerId(int CustomerId) {
this.CustomerId = Math.abs(CustomerId) ; }
public int getnProducts() {
return nProducts; }
public void setnProducts(int nProducts) {
this.nProducts = Math.abs(nProducts) ; }
public Product[] getProducts() {
return Products; }
public void setProducts(Product[] Products) {
this.Products = Products; }

public void addProduct(Product product){
for(int i = 0 ; i < Products.length ; i++){
if(Products[i] == null){
Products[i] = product ;
 break ;    } } }

public void  removeProduct(Product product){
for(int i = 0 ; i < Products.length ; i++){
if(Products[i] == product){
Products[i] = null ; 
 break ;   } } }

public float calculatePrice(){
float totalPrice = 0 ;
for (int i = 0; i < Products.length; i++) {
if (Products[i] != null) {
totalPrice += Products[i].getPrice(); } }
return totalPrice; }

public void placeOrder() {
int orderId = 1 ;  
Order order = new Order(CustomerId ,orderId, Products ,calculatePrice());
order.printOrderInfo(); }

 public void printCartContents() {             
System.out.println("Cart Contents => ");
for (int i = 0; i < Products.length; i++) {
if (Products[i] != null) {
System.out.println("Product Id : " + Products[i].getProductId());
System.out.println("Product Name : " + Products[i].getName());
System.out.println("Price : " + Products[i].getPrice()); }}}}
  
