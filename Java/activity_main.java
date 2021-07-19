
package com.example.currancy_converter;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import static android.widget.Toast.LENGTH_LONG;


public class MainActivity extends AppCompatActivity {
    Spinner sp1, sp2;
    EditText ed1;
    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        ed1 = findViewById(R.id.txtamount);
        sp1 = findViewById(R.id.spfrom);
        sp2 = findViewById(R.id.spto);
        b1 = findViewById(R.id.btn1);


        String[] from = {"USD", "Indian Rupess","Euro"};
        ArrayAdapter ad = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, from);
        sp1.setAdapter(ad);


        String[] to = {"Indian Rupess", "Srilankan Rupess", "Euro", "Indonesian", "Japanese", "Nepalese", "Turkish", "USD"};
        ArrayAdapter ad1 = new ArrayAdapter<String>(this, R.layout.support_simple_spinner_dropdown_item, to);
        sp2.setAdapter(ad1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double tot;

                Double amount = Double.parseDouble(ed1.getText().toString());
//USD Converter
                if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indian Rupess") {
                    tot = amount * 72.8575;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Srilankan Rupess") {
                    tot = amount * 198.75;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Euro") {
                    tot = amount * 0.8186;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Indonesian") {
                    tot = amount * 14335.0;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Japanese") {
                    tot = amount * 108.7675;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Nepalese") {
                    tot = amount * 116.57;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "USD" && sp2.getSelectedItem().toString() == "Turkish") {
                    tot = amount * 8.4044;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                }
//Indian Ruppes Converter
                if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount * 0.013;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "Srilankan Rupess") {
                    tot = amount * 2.65;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "Euro") {
                    tot = amount * 0.011;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "Indonesian") {
                    tot = amount * 194.23;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "Japanese") {
                    tot = amount * 1.46;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "Nepalese") {
                    tot = amount * 1.59;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "Turkish") {
                    tot = amount * 0.11;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Indian Rupess" && sp2.getSelectedItem().toString() == "Indian Rupess") {
                    tot = amount * 1;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                }
//Srilankan Rupees converter
                if (sp1.getSelectedItem().toString() == "Srilankan Rupess" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount * 0.0050;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Srilankan Rupess" && sp2.getSelectedItem().toString() == "Srilankan Rupess") {
                    tot = amount * 0.38;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Srilankan Rupess" && sp2.getSelectedItem().toString() == "Euro") {
                    tot = amount * 0.0043;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Srilankan Rupess" && sp2.getSelectedItem().toString() == "Indonesian") {
                    tot = amount * 73.19;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Srilankan Rupess" && sp2.getSelectedItem().toString() == "Japanese") {
                    tot = amount * 0.55;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Srilankan Rupess" && sp2.getSelectedItem().toString() == "Nepalese") {
                    tot = amount * 0.60;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Srilankan Rupess" && sp2.getSelectedItem().toString() == "Turkish") {
                    tot = amount * 0.043;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Srilankan Rupess" && sp2.getSelectedItem().toString() == "Indian Rupess") {
                    tot = amount * 0.38;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                }
//Euro Rupees Conerter
                if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "USD") {
                    tot = amount * 1.18;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Srilankan Rupess") {
                    tot = amount * 234.36;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Indonesian") {
                    tot = amount * 17137.97;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Japanese") {
                    tot = amount * 129.33;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Nepalese") {
                    tot = amount * 141.11;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Turkish") {
                    tot = amount * 10.11;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                } else if (sp1.getSelectedItem().toString() == "Euro" && sp2.getSelectedItem().toString() == "Indian Rupess") {
                    tot = amount * 88.31;
                    Toast.makeText(getApplicationContext(), tot.toString(), LENGTH_LONG).show();
                }

            }
        });


    }


}
