package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] menuItems = {"Meat", "Chicken", "Beverage", "Dessert"};



        final ListAdapter menuAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, menuItems);
        ListView menuListView = (ListView) findViewById(R.id.menuListView);
        menuListView.setAdapter(menuAdapter);
        menuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent tempMenu = new Intent(MainActivity.this, SelectActivity.class);
                switch(position+1){
                   case 1:
                       String [] meat = {"Churrasco - 9.55$", "Sirloin - 11.00$", "Fillet Minion - 14.75$", "Ribs - 20.00$"};
                       SelectActivity.stringArray(meat);
                       startActivity(tempMenu);
                       break;
                   case 2:
                       String [] chicken = {"Al Ajillo - 9.55$", "Fried - 11.00$", "Spicy - 14.75$", "Jerk - 20.00$"};
                       SelectActivity.stringArray(chicken);
                       startActivity(tempMenu);
                       break;
                   case 3:
                       String [] beverages = {"Water - 2.55$", "Coke - 5.00$", "Wine - 15.75$", "Champagne - 20.00$"};
                       SelectActivity.stringArray(beverages);
                       startActivity(tempMenu);
                       break;
                   case 4:
                       String [] dessert = {"Ice Cream - 9.55$", "Chocolate Cake - 11.00$", "Vanilla Cake - 14.75$", "Diabetus - 20.00$"};
                       SelectActivity.stringArray(dessert);
                       startActivity(tempMenu);
                       break;
                   default:
                       ;

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
