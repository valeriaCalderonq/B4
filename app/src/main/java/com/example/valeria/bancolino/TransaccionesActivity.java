package com.example.valeria.bancolino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class TransaccionesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transacciones);
    }
    public void Depositar(View view){
        Intent depositar = new Intent(this, CuentaBancariaActivity.class);
        startActivity(depositar);
    }
    public void Volver(View view){
        Intent volver = new Intent(this, CuentaBancariaActivity.class);
        startActivity(volver);
    }
}
