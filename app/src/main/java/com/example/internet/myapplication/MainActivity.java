package com.example.internet.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void dadosPessoais(View v){
        Intent i = new Intent(this, DadosPessoais.class);
        startActivity(i);
    }
    public void contatos(View v){
        Intent i = new Intent( this,Contatos.class);
        startActivity(i);
    }
    public void dadosProfissionais(View v) {
        Intent i = new Intent(this, DadoProfissionais.class);
        startActivity(i);
    }
}

