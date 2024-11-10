import java.util.ArrayList;
import java.util.Scanner;

abstract class Employee{
    protected int ID;
    protected String name;
    protected String roles;
    protected int workHour;
    public Employee(int ID, String name, String roles, int workHour){
        this.ID=ID;
        this.name=name;
        this.roles=roles;
        this.workHour=workHour;
    }
    abstract void input();
    abstract void output();
}
abstract class Ingredients{
    protected int IngID;
    protected String IngName;
    protected String ExpiryDate;
    public Ingredients(int IngID, String IngName, String ExpiryDate){
        this.IngID=IngID;
        this.IngName=IngName;
        this.ExpiryDate=ExpiryDate;
    }
    abstract void input();
    abstract void output();
}
class Customers{
    protected String Name;
    protected int age;
    protected int phoneNum;
    public Customers(String Name, int age, int phoneNum){
        this.Name=Name;
        this.age=age;
        this.phoneNum=phoneNum;
    }
}
class Chef extends Employee{
    private String cooking;
    public Chef(int ID, String name, String roles, int workHour, String cooking){
        super(ID, name, roles, workHour);
        this.cooking=cooking;
    }
    public void input(){

    }
    public void output(){

    }
}
class Janitor extends Employee{
    private String CleaningTable;
    public Janitor(){
        
    }
    public void input(){

    }
    public void output(){

    }
}
class Cashier extends Employee{
    private float bills;
    public Cashier(){

    } 
    public void input(){

    }
    public void output(){

    }
}
class Waiter extends Employee{
    private String NoteOrder;
    private String ServesAt;
    public Waiter(){

    }
    public void input(){

    }
    public void output(){

    }
}
class Recipes extends Ingredients{
    private String cookingSteps;
    public Recipes(){

    }
    public void input(){

    }
    public void output(){

    }
}
class Delivery extends Employee{
    private String address;
    public Delivery(int ID, String name, String roles, int workHour){
        super(ID, name, roles, workHour);
        this.address=address;
    }
}
class Order extends Customers{
    private int orderNum;
    private String address;
    private double totalPrice;
    public Order(String Name, int age, int phoneNum){
        super(Name, age, phoneNum);
        this.orderNum=orderNum;
        this.address=address;
        this.totalPrice=totalPrice;
    }
}
//add, edit, delete
class EmployeesList{
    
}
//Main menu
public class Project {
    public static void main(String[] args) {
        
    }
}