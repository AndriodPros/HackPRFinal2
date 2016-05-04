package com.example.cod5_.hackprfinal;

import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class SelectActivity extends AppCompatActivity {
    private static String [] items;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String [] menuItems = items;

        final ListAdapter menuAdapter = new ArrayAdapter<String>(this,android.R.layout.simple_expandable_list_item_1, menuItems);
        ListView menuListView = (ListView) findViewById(R.id.menuListView);
        menuListView.setAdapter(menuAdapter);
        menuListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
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

    public static void stringArray(String [] items){
        SelectActivity.items = items;
    }

    private void _getLocation() {
        // Get the location manager
        LocationManager locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);
        Criteria criteria = new Criteria();
        String bestProvider = locationManager.getBestProvider(criteria, false);
        Location location = locationManager.getLastKnownLocation();
        try {
            lat = location.getLatitude();
            lon = location.getLongitude();
        } catch (NullPointerException e) {
            lat = -1.0;
            lon = -1.0;
        }
    }

}
