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

public class VisorDream extends AppCompatActivity {

    private EditText textTitulo;
    private EditText textFecha;
    private EditText textDescripcion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visor_dream);


        textTitulo = (EditText) findViewById(R.id.titulo);
        textFecha = (EditText) findViewById(R.id.hora);
        textDescripcion = (EditText) findViewById(R.id.descripcion);

        if (getIntent() != null && getIntent().getExtras().containsKey("dream")) {
            Dream dream = (Dream) getIntent().getExtras().getSerializable("dream");
            textTitulo.setText(dream.getTitulo());
            textFecha.setText(dream.getFormattedTime());
            textDescripcion.setText(dream.getDescripcion());
        }
    }


    public void OnCliclFecha_Registro(View v) {
        Intent intent = new Intent(this, ModificarDreamActivity.class);
        startActivity(intent);
        finish();
    }

    public void OnClickTitulo_Registro(View v) {
        Intent intent = new Intent(this, ModificarDreamActivity.class);
        startActivity(intent);
        finish();
    }

    public void OnCliclDescripcion_Registro(View v) {
        Intent intent = new Intent(this, ModificarDreamActivity.class);
        startActivity(intent);
        finish();
    }
}