package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnWaiter;
    private Button btnMenu;

    public void onclick(){
        btnMenu= (Button) findViewById(R.id.btnMenu);
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity2= new Intent(MainActivity.this,MenuMod.class);
                startActivity(activity2);
            }
        });
        btnWaiter= (Button) findViewById(R.id.btnWaiter);
        btnWaiter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent activity2= new Intent(MainActivity.this,Waiter.class);
                startActivity(activity2);
            }
        });


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onclick();
        Menu_Organizer menu = new Menu_Organizer(); //ahora se pueden anadir menus al item
        Manager manager = new Manager(10); //10 mesas para empezar

       // Carnes
        menu.New_Menu_Item("Meat", "Yummy Grilled Churrasco", "Churrasco", 9.55f);
        menu.New_Menu_Item("Meat", "Sirloin" , "Steammy Siriloin",11.00f);
        menu.New_Menu_Item("Meat", "Fillet Minion" , "Tender Fillet Minion with baked potato",14.75f);
        menu.New_Menu_Item("Meat", "Ribs" , "Spicy BBQ Ribs", 20.00f);

        //Chicken
        menu.New_Menu_Item("Chicken", "Al ajillo" , "Chicken Breast Al Ajillo", 9.55f);
        menu.New_Menu_Item("Chicken", "Fried", "Crispy Fried Chicken", 11.00f);
        menu.New_Menu_Item("Chicken", "Spicy", "Spicy BBQ Chicken", 14.75f);
        menu.New_Menu_Item("Chicken", "Jerk", "Jamaican Chicken Jerk", 20.00f);

        //Beverage
        menu.New_Menu_Item("Beverage", "Coke", "Coca Cola", 2.00f);
        menu.New_Menu_Item("Beverage", "Wine", "Italian Premium Wine", 15.75f);
        menu.New_Menu_Item("Beverage", "Water", "Fiji Water",2.00f );
        menu.New_Menu_Item("Beverage", "Champagne", "Sparkling French Champagne", 20.00f);

        //Dessert
        menu.New_Menu_Item("Dessert", "Ice Cream", "Sweet and Creemy Ice Cream of your choice", 5.99f);
        menu.New_Menu_Item("Dessert", "Chococalte Cake", "Chocolate Cake served with Ice Cream", 11.00f);
        menu.New_Menu_Item("Dessert", "Vanilla Cake", "Vanilla Cake served with Fruits", 14.75f);



    }
}