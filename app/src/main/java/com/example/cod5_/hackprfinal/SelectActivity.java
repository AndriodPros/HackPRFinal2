package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.Objects;

public class SelectActivity extends AppCompatActivity {
    private static String [] items;
   // Intent i = getIntent();
    //public Menu_Organizer menu = (Menu_Organizer) i.getParcelableExtra("Menu");
    //public Manager manager = (Manager) i.getParcelableExtra("Manager");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);
        String [] menuItems = items;
        Intent i = getIntent();
        //int id = (int)i.getSerializableExtra("Table_id");


        final ListAdapter menuAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, menuItems);
        final ListView menuListView = (ListView) findViewById(R.id.menuListView);
        menuListView.setAdapter(menuAdapter);
        menuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String itemName = menuListView.getSelectedItem().toString();
                /*for(int i = 0; i < MainActivity.menu.Food.size(); i++){
                    if(Objects.equals(itemName,MainActivity.menu.Food.get(i).getName())){
                        for(int n = 0; n < MainActivity.manager.Customers.size(); n++){
                            if(MainActivity.manager.Customers.get(n).Table_ID == Recibo_Unpaid.id){
                                MainActivity.manager.Customers.get(n).addToSubTotal(MainActivity.menu.Food.get(i).getPrice());
                                MainActivity.manager.Customers.get(n).Add_Item(MainActivity.menu.Food.get(i));
                            }
                        }
                    }
                }*/
               switch(position){
                   case 1:

                       break;
                   case 2:
                       break;
                   case 3:
                       break;
                   case 4:
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

    public static void stringArray(String [] items){
        SelectActivity.items = items;
    }

//    private void _getLocation() {
//        // Get the location manager
//        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
//        Criteria criteria = new Criteria();
//        String bestProvider = locationManager.getBestProvider(criteria, false);
//        Location location = locationManager.getLastKnownLocation();
//        try {
//            lat = location.getLatitude();
//            lon = location.getLongitude();
//        } catch (NullPointerException e) {
//            lat = -1.0;
//            lon = -1.0;
//        }
//    }

}
