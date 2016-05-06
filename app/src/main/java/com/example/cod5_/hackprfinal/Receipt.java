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
	String Name_Waiter;
	int Table_ID;
	int Recibo_ID;
	ArrayList<Menu_Items> Orden;
	Boolean Paid;
	String Time_Paid; 

	public Receipt(){}
	public void Interactive_Menu(){} //displays the menu of available items with the option of adding items
	public void Add_Item(){} //Stores whatever value was chosen on the Menu and adds it to the order
	public void	Delete_Item(){} //Remove previously Item from recepit
	public void Modify_Item(){} //Modies or exchanges in current receipt

	public float Calculate_Tax(){return 0.0f;} //Calculates the Tax for the current SubTotal
	public float Calculate_Tip(){return 0.0f;} //Adds tip to the current order
	public float Final_Total(){return 0.0f;} //Adds up everything for final total
	public void Print_Receipt(){} //Prints th Receipt with Final Total, list of oders and other identifiers.
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
}rr*/


