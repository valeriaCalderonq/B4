package com.example.valeria.bancolino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CuentaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuenta2);
    }
    public void Volver(View view){
        Intent volver = new Intent(this, CuentaBancariaActivity.class);
        startActivity(volver);

    }
}
