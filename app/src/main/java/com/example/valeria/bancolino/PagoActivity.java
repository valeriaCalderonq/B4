package com.example.valeria.bancolino;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;


public class PagoActivity  extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pago);

    }
    public void Volver(View view){
        Intent volver = new Intent(this, CuentaBancariaActivity.class);
        startActivity(volver);

    }
    public void Agua(View view){
        Intent agua = new Intent(this, AguaActivity.class);
        startActivity(agua);

    }
    public void Luz(View view){
        Intent luz = new Intent(this, LuzActivity.class);
        startActivity(luz);

    }
    public void Universidad(View view){
        Intent universidad = new Intent(this, UniversidadActivity.class);
        startActivity(universidad);

    }
    public void Telefono(View view){
        Intent telefono = new Intent(this, TelefonoActivity.class);
        startActivity(telefono);

    }
}
