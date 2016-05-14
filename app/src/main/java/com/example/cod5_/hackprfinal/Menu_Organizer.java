package com.example.cod5_.hackprfinal;

import java.util.ArrayList;

/**
 * Created by cod5_ on 5/6/2016.
 */
public class Menu_Organizer  {
    //Posibily could be private variables
    ArrayList<String> Menu_Categories;
    ArrayList<Menu_Items> Food;

    public Menu_Organizer() {
        //Menu_Categories = new ArrayList<String>();
        Food = new ArrayList<Menu_Items>();
    } //Creates a Menu for the first time

    public void New_Menu_Item(String cat, String desc, String name, float price) {

        Menu_Items temp = new Menu_Items(name, cat, desc, price);
        Food.add(temp);
    } // Adds new item to the restaurant's menu (Food array)

    public void New_Menu_Category(String cat) {
        if (Menu_Categories.size() > 0) {
            for (int i = 0; i < Menu_Categories.size(); i++) {
                if (Menu_Categories.get(i) == cat) {
                    break;
                }
            }
            Menu_Categories.add(cat);
        } else {
            Menu_Categories.add(cat);
        }
    } // Adds new category on the categories array

}