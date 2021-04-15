package com.example.etab_univ;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EtabUniv etabUniv = new EtabUniv();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText name = findViewById(R.id.name);
        EditText adresse = findViewById(R.id.addr);
        Button save = findViewById(R.id.save);
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name    = findViewById(R.id.name);
                EditText adresse = findViewById(R.id.addr);
                etabUniv.setName(name.getText().toString());
                etabUniv.setAdress(adresse.getText().toString());
                Toast.makeText(MainActivity.this, "le nom est saisi", Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this, "l'adresse est saisi", Toast.LENGTH_SHORT).show();
            }
        });
    }
}