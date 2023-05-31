package com.molosoft.multiplicacionayuda;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Selector extends AppCompatActivity {
    public int valor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
    }

    public void Tabla1(View view) {
        Intent k = new Intent(this, Tabla1.class);
        startActivity(k);
    }

    public void Tabla2(View view) {
        Intent k = new Intent(this, Tabla2.class);
        startActivity(k);
    }

    public void Tabla3(View view) {
        Intent k = new Intent(this, Tabla3.class);
        startActivity(k);
    }

    public void Tabla4(View view) {
        Intent k = new Intent(this, Tabla4.class);
        startActivity(k);
    }

    public void Tabla5(View view) {
        Intent k = new Intent(this, Tabla5.class);
        startActivity(k);
    }

    public void Tabla6(View view) {
        Intent k = new Intent(this, Tabla6.class);
        startActivity(k);
    }

    public void Tabla7(View view) {
        Intent k = new Intent(this, Tabla7.class);
        startActivity(k);
    }

    public void Tabla8(View view) {
        Intent k = new Intent(this, Tabla8.class);
        startActivity(k);
    }

    public void Tabla9(View view) {
        Intent k = new Intent(this, Tabla9.class);
        startActivity(k);
    }
}