package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuMod extends AppCompatActivity {
    private Button btnAddMenu;
    //private Button btnModMenu;

    public void onclick() {
        btnAddMenu = (Button) findViewById(R.id.btnAddMenu);
        btnAddMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addmenu = new Intent(MenuMod.this, Add_Item.class);
                startActivity(addmenu);
            }
        });
    }


//    public void onclick() {
//        btnAddMenu = (Button) findViewById(R.id.btnAddMenu);
//        btnAddMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent Add = new Intent(MenuMod.this, NewItem.class);
//                startActivity(Add);
//            }
//        });
//        btnModMenu = (Button) findViewById(R.id.btnModMenu);
//        btnModMenu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent DisOrders = new Intent(MenuMod.this, ModItem.class);
//                startActivity(DisOrders);
//            }
//        });
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mod);
        onclick();
    }
}
