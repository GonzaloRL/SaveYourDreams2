package com.example.gonzalo.saveyourdreams.Layout;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.gonzalo.saveyourdreams.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void OnCliclLogin(View v){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
        finish();
    }
    public void OnCliclLogin_Registro(View v){
        Intent intent = new Intent(this,RegistroActivity.class);
        startActivity(intent);
        finish();
    }
}
