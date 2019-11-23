package com.dariooliveirajr.dmesp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class PlannerActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planner);

        ImageView plannerVolta = (ImageView) findViewById(R.id.btnVoltaIdPlan);
        plannerVolta.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String s = ((MyApplication) getApplicationContext()).getTipo();
                 if(s.equals("pai")) {
                     Intent intent_main = new Intent(getApplicationContext(), PaisActivity.class);
                     startActivity(intent_main);
                     finish();
                 }else{
                     Intent intent_main = new Intent(getApplicationContext(), EscolaActivity.class);
                     startActivity(intent_main);
                     finish();
                 }
             }
         });

    }
}