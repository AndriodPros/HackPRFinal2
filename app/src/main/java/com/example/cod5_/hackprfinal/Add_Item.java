package com.example.cod5_.hackprfinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Add_Item extends AppCompatActivity {
   //buttons are declared in this section
   // Menu_Organizer menu;
    //Manager manager;
    Spinner spinner1;
    Button button;
    Button button2;
    Button button3;
    EditText text_name;
    EditText text_description;
    EditText text_price;
    ArrayAdapter<CharSequence> adapter; //this is an ArrayAdapter to get text from array of string.xml found on values folder

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__item);

       // Intent i = getIntent();
       // menu = (Menu_Organizer) i.getParcelableExtra("Menu");
        //manager = (Manager) i.getParcelableExtra("Manager");

        spinner1 = (Spinner)findViewById(R.id.spinner_categories);//find the spinner by id
        adapter = ArrayAdapter.createFromResource(this,R.array.spinner,android.R.layout.simple_spinner_item);//method for spinner
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);//view of spinner
        spinner1.setAdapter(adapter); //set spinner
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){ //function override of the spinner display

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), parent.getItemAtPosition(position)+ " select", Toast.LENGTH_LONG).show();
             //   String selected = parent.getItemAtPosition(position).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                //do nothing
            }
        });


        button = (Button) findViewById(R.id.add_button);//find the button by id
        button2 = (Button) findViewById(R.id.clear_button);//find clear button
        button3 = (Button) findViewById(R.id.cancel_button);//find cancel button
        text_name = (EditText) findViewById(R.id.name_text);//find the EditText1
        text_description = (EditText) findViewById(R.id.description_text);//find EditText2
        text_price = (EditText) findViewById(R.id.price_text);//find EditText3

        button.setOnClickListener( //this is the action made when you press the button
                new View.OnClickListener()
                {
                    public void onClick(View view) //when the button is clicked do the following.
                    {
                        //log v is to input on the terminal but it can be stored
                        Toast.makeText(Add_Item.this, "An Item has been added", Toast.LENGTH_SHORT).show();
                        Log.v("Name", text_name.getText().toString());//name gettext
                        Log.v("Description", text_description.getText().toString());//description gettext
                        Log.v("Category", spinner1.getSelectedItem().toString()); //spinner gettext
                        Log.v("Price", text_price.getText().toString()); //price gettext

                        text_name.getText().clear();
                        text_description.getText().clear();
                        text_price.getText().clear();

                       // String name = text_name.getText().toString();
                        //String des = text_description.getText().toString();
                        //float price = Float.parseFloat(text_price.getText().toString());
                        //String cat = spinner1.getSelectedItem().toString();
                       // menu.New_Menu_Item(cat, des, name, price);

                    }
                }
        );

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //this method is to clear the textview
                text_name.getText().clear();
                text_description.getText().clear();
                text_price.getText().clear();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });







    }
}
