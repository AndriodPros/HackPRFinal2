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

import java.util.ArrayList;

public class Add_Item extends AppCompatActivity {
   //buttons are declared in this section
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
        spinner1 = (Spinner)findViewById(R.id.spinner);//find the spinner by id
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


        button = (Button) findViewById(R.id.button);//find the button by id
        button2 = (Button) findViewById(R.id.button2);//find clear button
        button3 = (Button) findViewById(R.id.button3);
        text_name = (EditText) findViewById(R.id.editText);//find the EditText1
        text_description = (EditText) findViewById(R.id.editText2);//find EditText2
        text_price = (EditText) findViewById(R.id.editText3);//find EditText3

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
