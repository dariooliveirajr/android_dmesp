package com.dariooliveirajr.dmesp;

import android.app.Application;

public class MyApplication extends Application {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipoPai() {
        this.tipo = "pai";
    }

    public void setTipoEscola() {
        this.tipo = "escola";
    }
}