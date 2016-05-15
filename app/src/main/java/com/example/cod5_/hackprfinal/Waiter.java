package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Waiter extends AppCompatActivity {
    private Button btnIntMenu;
    private Button btnDisplayOrder;
    public Menu_Organizer menu ;
    public Manager manager;


    public void onclick() {
        btnIntMenu = (Button) findViewById(R.id.btnInterMenu);
        btnIntMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intmenu = new Intent(Waiter.this, Menu2.class);
                startActivity(intmenu);
            }
        });
//        btnDisplayOrder = (Button) findViewById(R.id.btnDisplayOrder);
//        btnDisplayOrder.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent DisOrders = new Intent(Waiter.this, Orders.class);
//                startActivity(DisOrders);
//            }
//        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_waiter);
        onclick();
        Intent i = getIntent();
        menu = (Menu_Organizer) i.getParcelableExtra("Menu");
        manager = (Manager) i.getParcelableExtra("Manager");
    }
}
