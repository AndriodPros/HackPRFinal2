package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MenuMod extends AppCompatActivity {
    private Button btnAddMenu;
    private Button btnModMenu;
   // private Button btnModMenu;
    public Menu_Organizer menu;
    public  Manager manager;

    public void onBackPressed(){
        Intent i = getIntent();
        Intent mainmenu = new Intent(MenuMod.this, MainActivity.class);
        mainmenu.putExtra("Menu_Organizer", menu); //pasar objeto de menu al activity 2
        mainmenu.putExtra("Manager", manager); //pasar objeto de manager al activity 2
        startActivity(mainmenu);
    }

    public void onclick() {
        btnAddMenu = (Button) findViewById(R.id.btnAddMenu);
        btnModMenu = (Button) findViewById(R.id.btnModMenu);

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

        btnModMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = getIntent();
                Intent addmenu = new Intent(MenuMod.this, Add_Item.class); // later change to delete shit or change
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
        Intent i = getIntent();
        Bundle b = i.getExtras();
        menu = (Menu_Organizer) i.getSerializableExtra("Menu_Organizer");
        manager = (Manager) i.getSerializableExtra("Manager");
        onclick();

        //Intent i = getIntent();
        //menu = (Menu_Organizer) i.getParcelableExtra("Menu");
        //manager = (Manager) i.getParcelableExtra("Manager");

    }
}
