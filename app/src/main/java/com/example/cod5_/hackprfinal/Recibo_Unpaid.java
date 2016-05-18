package com.example.cod5_.hackprfinal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Recibo_Unpaid extends AppCompatActivity {
    private Button addbtntMenu;
    private Button finishBtn;
    // private Button btnDisplayOrder;
    public Menu_Organizer menu;
    public Manager manager;
    public static int id;


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


        finishBtn = (Button) findViewById(R.id.finishButton);
        finishBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            for(int i = 0; i < MainActivity.manager.getReceiptCount(); i++){
                if(Integer.parseInt(((EditText) findViewById(R.id.mesa_text)).getText().toString()) == MainActivity.manager.Customers.get(i).Table_ID){
                    Intent intmenu = new Intent(Recibo_Unpaid.this, Menu2.class);
                    id = MainActivity.manager.Customers.get(i).Table_ID;
                    //intmenu.putExtra("Table_id",id);
                }
            }

            }
        });

        addbtntMenu = (Button) findViewById(R.id.cancel_button);
        addbtntMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd_HHmmss");
                String currentDateandTime = sdf.format(new Date());
                Receipt.resetSubTotal();
                Intent intmenu = new Intent(Recibo_Unpaid.this, Menu2.class);
                Receipt temp = new Receipt(0.0f, ((EditText) findViewById(R.id.price_text)).getText().toString(),Integer.parseInt(((EditText) findViewById(R.id.mesa_text)).getText().toString()) ,MainActivity.manager.getReceiptCount(),new ArrayList<Menu_Items>(), false, currentDateandTime);
                MainActivity.manager.addReceipt(temp);
                id = Integer.parseInt(((EditText) findViewById(R.id.mesa_text)).getText().toString());
                //intmenu.putExtra("Table_id",id);
                intmenu.putExtra("Menu_Organizer", menu); //pasar objeto de menu al activity 2
                intmenu.putExtra("Manager", manager); //pasar objeto de manager al activity 2
                startActivity(intmenu);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recibo__unpaid);
        Intent i = getIntent();
        Bundle b=i.getExtras();
        menu = (Menu_Organizer) i.getSerializableExtra("Menu_Organizer");
        manager = (Manager) i.getSerializableExtra("Manager");

        TextView subtotal = (TextView) findViewById(R.id.subtotal);

        subtotal.setText(Float.toString(Receipt.Sub_Total));

        onclick();
    }
}
