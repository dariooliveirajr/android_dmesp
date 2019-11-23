package com.dariooliveirajr.dmesp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class EscolaActivity extends Activity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_escola);

        ImageButton btnPlan = (ImageButton) findViewById(R.id.btnPlanIdE);
        ImageButton btnLic = (ImageButton) findViewById(R.id.btnLicIdE);
        ImageButton btnSob = (ImageButton) findViewById(R.id.btnSobIdE);
        ImageButton btnCon = (ImageButton) findViewById(R.id.btnConIdE);

        btnPlan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_planner = new Intent(getApplicationContext(), PlannerActivity.class);
                startActivity(intent_planner);
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

        ImageView escolaVolta = (ImageView) findViewById(R.id.btnVoltaIdEsco);
        escolaVolta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent_main = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent_main);
                finish();
            }
        });
    }
}