package com.example.cod5_.hackprfinal;

/**
 * Created by cod5_ on 5/6/2016.
 */
public class Menu_Items {

    String Name = "";
    String Description = "";
    float Price = 0.0f;
    String Category = "";

    public Menu_Items(String name, String category, String description, float price)
    {
        this.setName(name);
        this.setCategory(category);
        this.setDescription(description);
        this.setPrice(price);
    }

    public void setName(String name){
        this.Name = name;
    }
    public void setDescription(String description){
        this.Description= description;
    }
    public void setPrice(float price){
        this.Price = price;
    }
    public void setCategory(String category){
        this.Category = category;
    }

    public String getName(){
        return this.Name;
    }
    public String getDescription(){
        return this.Description;
    }
    public float getPrice(){
        return this.Price;
    }
    public String getCategory(){
        return this.Category;
    }

}
