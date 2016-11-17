package com.example.gonzalo.saveyourdreams.Layout;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.example.gonzalo.saveyourdreams.Clases.Dream;
import com.example.gonzalo.saveyourdreams.R;

public class ModificarDreamActivity extends AppCompatActivity {
    private EditText textTitulo;
    private EditText textFecha;
    private EditText textDescripcion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar_dream);
        textTitulo = (EditText) findViewById(R.id.tituloM);
        textFecha = (EditText) findViewById(R.id.horaM);
        textDescripcion = (EditText) findViewById(R.id.descripcionM);


    }
}
