package br.com.senacrs.usuario;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.view.*;
public class MainActivity extends AppCompatActivity {
    Button btnTelaPrincipal, btnTela2;

    @Override
    public void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        CarregarTelaPrincipal();
    }
public void CarregarTelaPrincipal(){
        setContentView(R.layout.activity_main);
        btnTela2 = (Button) findViewById(R.id.btnTela2);
        btnTela2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTela2();
            }
        });
}

public void CarregarTela2(){
        setContentView(R.layout.tela2);
        btnTelaPrincipal = (Button) findViewById(R.id.btnTelaPrincipal);
        btnTelaPrincipal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CarregarTelaPrincipal();
            }
        });
}
}