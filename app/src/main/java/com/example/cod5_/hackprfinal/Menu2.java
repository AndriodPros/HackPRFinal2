
package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Objects;

public class Menu2 extends AppCompatActivity {
    Menu_Organizer menu;
    Manager manager;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        String [] menuItems = {"Meat", "Chicken", "Beverage", "Dessert"};

        Intent i= getIntent();
        menu = (Menu_Organizer) i.getSerializableExtra("Menu");
        manager = (Manager) i.getSerializableExtra("Manager");



        final ListAdapter menuAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, menuItems);
        ListView menuListView = (ListView) findViewById(R.id.menuListView);
        menuListView.setAdapter(menuAdapter);
        menuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent tempMenu = new Intent(Menu2.this, SelectActivity.class);
                switch(position+1){
                    case 1:


                       ArrayList<String>  meat = new ArrayList<String>();

                        for(int i = 0; i<menu.Food.size(); i++){

                           if(menu.Food.get(i).Category=="Meat")
                            {
                                meat.add(menu.Food.get(i).Name);
//                                String []meats = new String[meat.size()];
//                                meat.toArray(meats);
//                                SelectActivity.stringArray(meats);
//                                startActivity(tempMenu);

                            }
                        }
//                        String []meats = new String[meat.size()];
//                        meat.toArray(meats);
//                        SelectActivity.stringArray(meats);
//                        startActivity(tempMenu);
                        //startActivity(tempMenu);
                        break;
                    case 2:
                        ArrayList<String>  Chicken = new ArrayList<String>();
                        for(int i = 0; i<menu.Food.size(); i++){
                            Log.e("Item: ", menu.Food.get(i).Category);
                            if(Objects.equals(menu.Food.get(i).Category, "Chicken"))
                            {
                                Log.e("Item: ", menu.Food.get(i).Category);
                                Log.e("Item: ", menu.Food.get(i).Name);
                                Chicken.add(menu.Food.get(i).Name);
//                                SelectActivity.(Chicken);
//                                startActivity(tempMenu);
//                                String []chickens = new String[Chicken.size()];
//                                Chicken.toArray(chickens);
//                                SelectActivity.stringArray(chickens);
//                                startActivity(tempMenu);
                            }


                        }
                        String []chickens = new String[Chicken.size()];
                        Chicken.toArray(chickens);
                        SelectActivity.stringArray(chickens);
                        startActivity(tempMenu);
//                        String [] chicken = {"Al Ajillo - 9.55$", "Fried - 11.00$", "Spicy - 14.75$", "Jerk - 20.00$"};
//                        SelectActivity.stringArray(chicken);
//                        startActivity(tempMenu);
                        break;
                    case 3:
                        ArrayList<String>  beverages = new ArrayList<String>();
                        for(int i = 0; i<menu.Food.size(); i++){
                            if(menu.Food.get(i).Category=="Beverages")
                            {beverages.add(menu.Food.get(i).Name);}
                        }
                        String []beverage = new String[beverages.size()];
                        beverages.toArray(beverage);
                        SelectActivity.stringArray(beverage);
                        startActivity(tempMenu);
//                        String [] beverages = {"Water - 2.55$", "Coke - 5.00$", "Wine - 15.75$", "Champagne - 20.00$"};
//                        SelectActivity.stringArray(beverages);
//                        startActivity(tempMenu);
                        break;
                    case 4:
                        ArrayList<String>  dessert = new ArrayList<String>();
                        for(int i = 0; i<menu.Food.size(); i++){
                            if(Objects.equals(menu.Food.get(i).Category, "Dessert"));
                            {dessert.add(menu.Food.get(i).Name);}
                        }

//                        String [] dessert = {"Ice Cream - 9.55$", "Chocolate Cake - 11.00$", "Vanilla Cake - 14.75$"};
//                        SelectActivity.stringArray(dessert);
//                        startActivity(tempMenu);
                        break;

                    default:


                }

            }
        });


    }

    public class itemListen implements AdapterView.OnItemClickListener{


        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

        }
    }
}
