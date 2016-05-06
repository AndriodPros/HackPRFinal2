package com.example.cod5_.hackprfinal;

import java.util.ArrayList;

/*
	Takes each individual receipt  of every customer's order.
	Allows the WAITER the selection of items on the menu
	adding them on the order. Finally the class will 
*/
public class Receipt
{
	float Sub_Total;
    float Tip;
	String Name_Waiter;
	int Table_ID;
	int Recibo_ID;
	ArrayList<Menu_Items> Orden;
	Boolean Paid;
	String Time_Paid;
    String final_Receipt;
    float final_Tax;
    final float tax = 0.115f;


	public Receipt(float Sub_Total, String Name_Waiter, int Table_ID, int Recibo_ID, ArrayList<Menu_Items> Orden, Boolean Paid, String Time_Paid){

        this.Sub_Total = Sub_Total;
		this.Name_Waiter = Name_Waiter;
		this.Table_ID = Table_ID;
		this.Recibo_ID = Recibo_ID;
		this.Orden = Orden;
		this.Paid = Paid;
		this.Time_Paid = Time_Paid;
        this.Tip = 0.0f;
        this.final_Tax = 0.0f;
        this.final_Receipt = "";
	}
	public void Interactive_Menu(){

    } //displays the menu of available items with the option of adding items

    public void Add_Item(Menu_Items item){
        Orden.add(item);
    } //Stores whatever value was chosen on the Menu and adds it to the order

	public void	Delete_Item(Menu_Items item){
       for(int i = 0; i < this.Orden.size(); i++){
           if(this.Orden.get(i).getName() == item.getName()){
               this.Orden.remove(i);
               break;
           }
       }
    } //Remove previously Item from recepit

	public void Modify_Item(Menu_Items item, Menu_Items change){
        for(int i = 0; i < this.Orden.size(); i++){
            if(this.Orden.get(i).getName() == item.getName()){
                this.Orden.set(i,change);
                break;
            }
        }
    } //Modies or exchanges in current receipt

	public float Calculate_Tax(){
        this.final_Tax = (this.Sub_Total * this.tax);
        return (this.Sub_Total * this.tax);
    } //Calculates the Tax for the current SubTotal

	public float Calculate_Tip(float tip){
        this.Tip = (this.Sub_Total * (tip/100.0f));
        return (this.Sub_Total * (tip/100.0f));
    } //Adds tip to the current order

	public float Final_Total(){
        return this.Sub_Total + this.Tip + this.final_Tax;
    } //Adds up everything for final total

	public String Print_Receipt(){

        this.final_Receipt = "---------------------------\n"
                             +" " + this.Name_Waiter + ", Table: " + this.Table_ID + "\n";
        for(int i = 0; i < this.Orden.size(); i++){
            this.final_Receipt += this.Orden.get(i).Name + " " + this.Orden.get(i).Price + "$\n";
        }

        this.final_Receipt += "SubTotal: " + this.Sub_Total + "$\n"
                           + "Tax: " + this.final_Tax + "$\n"
                           + "Tip: " + this.Tip + "$\n"
                           + "Total: " + Final_Total() + "$\n"
                           + "---------------------------";

        return this.final_Receipt;

    } //Prints th Receipt with Final Total, list of oders and other identifiers.
}

/*
	Class that contains individual atributes of each item on the Menu.
*/
/*public class Menu_Items
{
	String Name;
	String Description;
	float Price;
	String Category; 
}*/

/*
	Class that Modifies the Menu of the restaurant.	
*/
/*public class Menu_Organizer
{
	//Posibily could be private variables 
	ArrayList<String> Menu_Categories;
	ArrayList<Menu_Items> Food; 

	public Menu_Organizer(); //Creates a Menu for the first time 
	public void New_Menu_Item(); // Adds new item to the restaurant's menu (Food array)
	public void New_Menu_Category(); // Adds new category on the categories array
	public void Delete_Menu_Item(); // Delete Menu item from the list 
}*/


/*
	Class that the Restaurant Manager uses to set up the menu and gathers information
	about the current orders taken that day. 
*/
/*public class Manager
{
	ArrayList<Recepit> Customers; //list of all of the customers of this day 
	int tables; //number of tables in the restaurant

	public Manager(); //sets up the date and tables for the current day
	public void Create_Recepit(); //Creates new instance of Recepit in the customer array
	public void Display_All_Orders(); //Displays All of the orders from today
	public void Reports(); //Sums up the total list of Orders revenues and clears the Customer array
}rrr*/


