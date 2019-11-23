package com.dariooliveirajr.dmesp;

import android.app.Application;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Spinner sistemas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sistemas = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.spinner_mobile, android.R.layout.simple_spinner_dropdown_item);
        sistemas.setAdapter(adapter);

        ImageView entrar = (ImageView) findViewById(R.id.btnentrar);
        entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String item = sistemas.getSelectedItem().toString();
                if(item.equals("Pais/Responsável")){
                    Intent intent_pais = new Intent(MainActivity.this, PaisActivity.class);
                    ((MyApplication) getApplicationContext()).setTipoPai();
                    startActivity(intent_pais);
                    finish();
                }else{
                    Intent intent_escola = new Intent(MainActivity.this, EscolaActivity.class);
                    ((MyApplication) getApplicationContext()).setTipoEscola();
                    startActivity(intent_escola);
                    finish();
                }
            }
        });


    }
}
