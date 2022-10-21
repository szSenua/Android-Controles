package com.example.elementosvarios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    CheckBox michael;
    CheckBox salim;

    RadioGroup radio;


    Spinner select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //michael = findViewById(R.id.michael);
        //salim = findViewById(R.id.salim);
        //radio = findViewById(R.id.radio);

        select = findViewById(R.id.select);
        select.setOnItemSelectedListener(this);

        /*michael.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(michael.isChecked()){
                    Toast.makeText(MainActivity.this, "michael marcado", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "michael desmarcado", Toast.LENGTH_SHORT).show();
                }
            }
        });

        radio.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (radio.getCheckedRadioButtonId()==R.id.hombre){
                    Toast.makeText(MainActivity.this, "hombre marcado", Toast.LENGTH_SHORT).show();
                }else if(radio.getCheckedRadioButtonId()==R.id.mujer){
                    Toast.makeText(MainActivity.this, "mujer marcada", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(MainActivity.this, "otros marcado", Toast.LENGTH_SHORT).show();
                }
            }
        });*/

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String item = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(MainActivity.this, item, Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}