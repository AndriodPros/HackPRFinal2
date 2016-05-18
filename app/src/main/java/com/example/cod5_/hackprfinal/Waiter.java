package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Waiter extends AppCompatActivity {
    private Button btnIntMenu;
   // private Button btnDisplayOrder;
    public Menu_Organizer menu;
    public Manager manager;


    public void onclick() {
        /*btnIntMenu = (Button) findViewById(R.id.btnRecibo);
        btnIntMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent intmenu = new Intent(Waiter.this, Menu2.class);
                intmenu.putExtra("Menu", menu); //pasar objeto de menu al activity 2
                intmenu.putExtra("Manager", manager); //pasar objeto de manager al activity 2
                startActivity(intmenu);
            }
        });*/
//        btnDisplayOrder = (Button) findViewById(R.id.btnDisplayOrder);
//        btnDisplayOrder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent DisOrders = new Intent(Waiter.this, Orders.class);
//                startActivity(DisOrders);
//            }
//        });

        btnIntMenu = (Button) findViewById(R.id.btnRecibo);
        btnIntMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmenu = new Intent(Waiter.this, Recibo_Unpaid.class);
                intmenu.putExtra("Menu_Organizer", menu); //pasar objeto de menu al activity 2
                intmenu.putExtra("Manager", manager); //pasar objeto de manager al activity 2
                startActivity(intmenu);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiter);
        Intent i = getIntent();
        Bundle b = i.getExtras();
        menu = (Menu_Organizer) i.getSerializableExtra("Menu_Organizer");
        manager = (Manager) i.getSerializableExtra("Manager");
        
        onclick();
    }
}
