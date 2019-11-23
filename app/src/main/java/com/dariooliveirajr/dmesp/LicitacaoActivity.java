package com.dariooliveirajr.dmesp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class LicitacaoActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_licitacao);

        ImageView licitacaoVolta = (ImageView) findViewById(R.id.btnVoltaIdLici);
        licitacaoVolta.setOnClickListener(new View.OnClickListener() {
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

    public void servicos(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://servicos.santanadeparnaiba.sp.gov.br/compras/index.php"));
        startActivity(browserIntent);
    }

    public void registros(View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.santanadeparnaiba.sp.gov.br/portaldatransparencia/atas_registro_2017/313-HOPEMIX%20SUPRIMENTOS%20E%20SERVIÇOS%20LTDA%20-%20EPP%20-%20MATERIAL%20ESCOLAR%20para%20formação%20de%20KITs.pdf"));
        startActivity(browserIntent);
    }
}