package ecommerce_system;
import java.util.Scanner; 
public class Ecommerce_System {
public static void main(String[] args) {
Scanner input = new Scanner (System.in);
System.out.println("Welcome to the E-commerce System ");
System.out.println("Please enter your ID : ");
int CustomerId = input.nextInt();
input.nextLine();
System.out.println("Please enter your name : ");
String name = input.nextLine();
System.out.println("Please enter your address : ");
String address = input.nextLine();
Customer customer = new Customer ( CustomerId , name , address );
System.out.println("How many products you want add to your car?");
int nProducts = input.nextInt();
input.nextLine();
Cart cart = new Cart (CustomerId , nProducts );
for (int i = 0 ; i < nProducts ;i++){
System.out.println("Which product would you like to add? 1- smartphone  2- T-shirt  3- oop");
int choice = input.nextInt();
input.nextLine();
switch (choice){
case 1:
ElectronicProduct EP = new ElectronicProduct(1, "Smartphone", 599.99f, "Samsung", 1);
cart.addProduct(EP);
break;
case 2:
ClothingProduct CP = new ClothingProduct (2, "T-shirt", 19.99f, "Medium", "Cotton");
cart.addProduct(CP);
 break;
case 3:
BookProduct BP = new BookProduct (3, "OOP" , 39.99f, "O'Reilly", "X Publications");
cart.addProduct(BP);
 
break;
default:
System.out.println("INVALID CHOICE");
  }}
float totalPrice = cart.calculatePrice();
    System.out.println("==================================");
System.out.println("Your total is $" + totalPrice);
    System.out.println("==================================");

System.out.println("Would you like to place the order? (1-yes, 2-no) ");
int orderChoice = input.nextInt();
    switch (orderChoice) {
        case 1:
            System.out.println("==================================");
            cart.placeOrder();
            break;
        case 2:
            System.out.println("THANK YOU ! THE ORDER NOT PLACED ");
            break;
        default: 
            System.out.println("INVALID CHOICE");
            input.close();
            break;
    }
 }}
 