package com.dariooliveirajr.dmesp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class PaisActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pais);

        ImageButton btnCron = (ImageButton) findViewById(R.id.btnCronIdP);
        ImageButton btnLic = (ImageButton) findViewById(R.id.btnLicIdP);
        ImageButton btnSob = (ImageButton) findViewById(R.id.btnSobIdP);
        ImageButton btnCon = (ImageButton) findViewById(R.id.btnConIdP);

        btnCron.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_conograma = new Intent(getApplicationContext(), CronogramaActivity.class);
                startActivity(intent_conograma);
                finish();
            }
        });

        btnLic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_licitacao = new Intent(getApplicationContext(), LicitacaoActivity.class);
                startActivity(intent_licitacao);
                finish();
            }
        });

        btnSob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_sobre = new Intent(getApplicationContext(), SobreActivity.class);
                startActivity(intent_sobre);
                finish();
            }
        });

        btnCon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_contato = new Intent(getApplicationContext(), ContatoActivity.class);
                startActivity(intent_contato);
                finish();
            }
        });

        ImageView paisVolta = (ImageView) findViewById(R.id.btnVoltaIdPais);
        paisVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent_main);
                finish();
            }
        });

    }
}