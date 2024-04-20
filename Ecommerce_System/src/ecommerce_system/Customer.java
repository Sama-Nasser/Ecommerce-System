package ecommerce_system;

public class Customer {
private int CustomerId ;
private String name ;  
private String address;
public Customer(){}
public Customer(int CustomerId, String name, String address) {
this.CustomerId = Math.abs(CustomerId);
this.name = name;
this.address = address;}
public int getCustomerId() {
return CustomerId; }
public void setCustomerId(int CustomerId) {
this.CustomerId = Math.abs(CustomerId);}
public String getName() {
return name;}
public void setName(String name) {
this.name = name; }
public String getAddress() {
return address;}
public void setAddress(String address) {
this.address = address; } }  
 