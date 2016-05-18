package com.example.cod5_.hackprfinal;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by cod5_ on 5/6/2016.
 */
public class Manager implements Serializable
{
    ArrayList<Receipt> Customers; //list of all of the customers of this day
    int tables; //number of tables in the restaurant

    public Manager(int tables){
        this.tables = tables;
        Customers = new ArrayList<Receipt>();
    } //sets up the date and tables for the current day

    public void Create_Recepit(float Sub_Total, String Name_Waiter, int Table_ID, int Recibo_ID, ArrayList<Menu_Items> Orden, Boolean Paid, String Time_Paid){
        Receipt tempReceipt = new Receipt(Sub_Total,Name_Waiter,Table_ID,Recibo_ID,Orden, Paid,Time_Paid);
        Customers.add(tempReceipt);
    } //Creates new instance of Recepit in the customer array

    public String Display_All_Orders(){
        String temp = "";
        for(int i = 0; i < Customers.size(); i++){
            temp += Customers.get(i).Print_Receipt() + "\n";
        }
        return temp;
    } //Displays All of the orders from today

    public void addReceipt(Receipt r){
        Customers.add(r);
    }

    public int getReceiptCount(){
        return Customers.size();
    }

    public float Reports(){
        float cuadre = 0.0f;

        for(int i = 0; i < Customers.size(); i++){
            cuadre += Customers.get(i).Final_Total();
        }

        Customers = new ArrayList<Receipt>();

        return cuadre;
    } //Sums up the total list of Orders revenues and clears the Customer array
}
