package com.example.tbptb;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class chat_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chat_1);
    }

    public void chat(View view) {
        startActivity(new Intent(this, chat.class));
        finish();
    }

    public void pinjam(View view) {
        startActivity(new Intent(this, pinjam.class));
        finish();
    }

    public void dashboard(View view) {
        startActivity(new Intent(this, dashboard.class));
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
}
