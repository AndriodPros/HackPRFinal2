package com.example.cod5_.hackprfinal;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by cod5_ on 5/6/2016.
 */
public  class Menu_Organizer implements Serializable {
    //Posibily could be private variables
    ArrayList<String> Categories;
    ArrayList<Menu_Items> Food;

    public Menu_Organizer() {
        Categories = new ArrayList<String>();
        Food = new ArrayList<Menu_Items>();
    } //Creates a Menu for the first time

    public void New_Menu_Item(String cat, String desc, String name, float price) {

        Menu_Items temp = new Menu_Items(name, cat, desc, price);
        Food.add(temp);
    } // Adds new item to the restaurant's menu (Food array)

    public void New_Menu_Category(String cat) {
        if (Categories.size() > 0) {
            for (int i = 0; i < Categories.size(); i++) {
                if (Categories.get(i) == cat) {
                    break;
                }
            }
            Categories.add(cat);
        } else {
            Categories.add(cat);
        }
    } // Adds new category on the categories array

}