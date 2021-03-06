package com.example.tbptb;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class dashboard extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void home(View view) {
        startActivity(new Intent(this, dashboard.class));
        finish();
    }

    public void chat(View view) {
        startActivity(new Intent(this, chat.class));
        finish();
    }

    public void pinjam(View view) {
        startActivity(new Intent(this, pinjam.class));
        finish();
    }

    public void fasilitas(View view) {
        startActivity(new Intent(this, fasilitas.class));
        finish();
    }

    public void bookmark(View view) {
        startActivity(new Intent(this, bookmark.class));
        finish();
    }

    public void profil(View view) {
        startActivity(new Intent(this, profil.class));
        finish();
    }
}
