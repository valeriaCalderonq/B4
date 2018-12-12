package com.example.valeria.bancolino;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText editarT;
    private EditText editarT2;
    private EditText editarT3;
    private EditText editarT4;
    private EditText editarT5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editarT = (EditText) findViewById(R.id.txt_text1);
        editarT2 = (EditText) findViewById(R.id.txt_text2);
        editarT3 = (EditText) findViewById(R.id.txt_text3);
        editarT4 = (EditText) findViewById(R.id.txt_text4);
        editarT5 = (EditText) findViewById(R.id.txt_text5);

    }

    public void Ingresar(View view){
        Intent ingresar = new Intent(this, CuentaBancariaActivity.class);
        startActivity(ingresar);

    }

}
