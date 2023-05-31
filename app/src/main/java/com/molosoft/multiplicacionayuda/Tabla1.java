package com.molosoft.multiplicacionayuda;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tabla1 extends AppCompatActivity {
    String texto;
    String mensajefinal = "Tabla del 1 \n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla1);

        TextView tabla1 = findViewById(R.id.tabla);
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = i;
            texto = "1" + "*" + i + "=" + resultado + "\n ";
            mensajefinal = mensajefinal + texto;
        }
        tabla1.setText(mensajefinal);
    }
}