package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuMod extends AppCompatActivity {
    private Button btnAddMenu;
   // private Button btnModMenu;
    public Menu_Organizer menu;
    public  Manager manager;

    public void onclick() {
        btnAddMenu = (Button) findViewById(R.id.btnAddMenu);

        btnAddMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = getIntent();
                Intent addmenu = new Intent(MenuMod.this, Add_Item.class);
                addmenu.putExtra("Menu_Organizer", menu); //pasar objeto de menu al activity 2
                addmenu.putExtra("Manager", manager); //pasar objeto de manager al activity 2
                startActivity(addmenu);

            }
        });

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_mod);
        onclick();

        Intent i = getIntent();
        //menu = (Menu_Organizer) i.getParcelableExtra("Menu");
        //manager = (Manager) i.getParcelableExtra("Manager");

    }
}
