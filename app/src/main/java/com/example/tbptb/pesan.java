package com.example.tbptb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class pesan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pemesanan_gedung);
    }
    public void backpinjam(View view) {
        startActivity(new Intent(this, pinjam.class));
        finish();
    }

    public void simpan(View view) {
        startActivity(new Intent(this, detail_pesan.class));
        finish();
    }

}
