package com.example.cod5_.hackprfinal;

import java.util.ArrayList;

/*
	Takes each individual receipt  of every customer's order.
	Allows the WAITER the selection of items on the menu
	adding them on the order. Finally the class will 
*/
public class Receipt
{

	public static float Sub_Total;
    float Tip;
	String Name_Waiter;
	int Table_ID;
	int Receipt_ID;
	ArrayList<Menu_Items> Orders;
	Boolean Paid;
	String Time_Paid;
    String final_Receipt;
    float final_Tax;
    final float tax = 0.115f;


	public Receipt(float Sub_Total, String Name_Waiter, int Table_ID, int Recibo_ID, ArrayList<Menu_Items> Orden, Boolean Paid, String Time_Paid){

        this.Sub_Total = Sub_Total;
		this.Name_Waiter = Name_Waiter;
		this.Table_ID = Table_ID;
		this.Receipt_ID = Recibo_ID;
		this.Orders = Orders;
		this.Paid = Paid;
		this.Time_Paid = Time_Paid;
        this.Tip = 0.0f;
        this.final_Tax = 0.0f;
        this.final_Receipt = "";
	}
	public void Interactive_Menu(){

    } //displays the menu of available items with the option of adding items

    public void Add_Item(Menu_Items item){
        Orders.add(item);
    } //Stores whatever value was chosen on the Menu and adds it to the order

	public void	Delete_Item(Menu_Items item){
       for(int i = 0; i < this.Orders.size(); i++){
           if(this.Orders.get(i).getName() == item.getName()){
               this.Orders.remove(i);
               break;
           }
       }
    } //Remove previously Item from recepit

	public void Modify_Item(Menu_Items item, Menu_Items change){
        for(int i = 0; i < this.Orders.size(); i++){
            if(this.Orders.get(i).getName() == item.getName()){
                this.Orders.set(i,change);
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

    public static void addToSubTotal(float value){
        Sub_Total += value;
    }

    public static void resetSubTotal(){
        Sub_Total = 0.0f;
    }

    public Boolean getPaid() {
        return Paid;
    }

    public void setPaid(Boolean paid) {
        Paid = paid;
    }

    public String getTime_Paid() {
        return Time_Paid;
    }

    public void setTime_Paid(String time_Paid) {
        Time_Paid = time_Paid;
    }

    public ArrayList<Menu_Items> getOrders() {
        return Orders;
    }

    public void setOrders(ArrayList<Menu_Items> orders) {
        Orders = orders;
    }

    public String Print_Receipt(){

        this.final_Receipt = "---------------------------\n"
                            + " HTL Kitchen\n"
                             +" " + this.Name_Waiter + ", Table: " + this.Table_ID + "\n";
        for(int i = 0; i < this.Orders.size(); i++){
            this.final_Receipt += this.Orders.get(i).Name + " " + this.Orders.get(i).Price + "$\n";
        }

        this.final_Receipt += "SubTotal: " + this.Sub_Total + "$\n"
                           + "Tax: " + this.final_Tax + "$\n"
                           + "Tip: " + this.Tip + "$\n"
                           + "Total: " + Final_Total() + "$\n"
                           + "---------------------------";

        return this.final_Receipt;

    } //Prints th Receipt with Final Total, list of oders and other identifiers.
}

