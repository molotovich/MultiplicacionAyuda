package com.molosoft.multiplicacionayuda;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Tabla8 extends AppCompatActivity {
    String texto;
    String mensajefinal = "Tabla del 8 \n";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tabla8);

        TextView tabla1 = findViewById(R.id.tabla);
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = 8 * i;
            texto = "8" + "*" + i + "=" + resultado + "\n ";
            mensajefinal = mensajefinal + texto;
        }
        tabla1.setText(mensajefinal);
    }
}