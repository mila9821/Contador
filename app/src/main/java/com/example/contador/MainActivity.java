package com.example.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //crear variable de tipo int
    public int contador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //iniciar el contador en 0
        contador = 0;
        mostrarResultado();
    }

    //crendo metodo incrementar
    public void incrementoContador(View view){
        contador++;
        mostrarResultado();
    }

    public void decrementoContador(View view){
        contador --;
        mostrarResultado();
    }
    public void reseteaContador(View view){
        contador = 0;
        mostrarResultado();
    }
    public void mostrarResultado(){
        TextView textoResultado = (TextView)findViewById(R.id.ContadorPosiciones);
        textoResultado.setText("Contador"+contador);
    }
}