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
    }
}