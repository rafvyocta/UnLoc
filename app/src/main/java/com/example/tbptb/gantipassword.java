package com.example.tbptb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gantipassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ganti_password);
    }

    public void ganti(View view) {
        startActivity(new Intent(this, profil.class));
        finish();
    }

    public void save(View view) {
        startActivity(new Intent(this, profil.class));
        finish();
    }
}
