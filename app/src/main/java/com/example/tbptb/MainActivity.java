package com.example.tbptb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tbptb.adapter.bookmarkAdapter;
import com.example.tbptb.model.BookmarkClass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView nvSavebookmark;
    com.example.tbptb.adapter.bookmarkAdapter bookmarkAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.front);

        bookmarkAdapter = new bookmarkAdapter();
        bookmarkAdapter.setListbookmark(generateData());

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        nvSavebookmark = findViewById(R.id.nvSaveBookmark);
        nvSavebookmark.setAdapter(bookmarkAdapter);
        nvSavebookmark.setLayoutManager(layoutManager);
    }

    public void login(View view) {
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }

    public void signup(View view) {
        startActivity(new Intent(this, signup.class));
        finish();
    }

    public ArrayList<BookmarkClass> generateData(){
        ArrayList<BookmarkClass> listbookmark = new ArrayList<>();
        
        listbookmark.add(new BookmarkClass("Parkir dpr", "Prakir Dekat Lapangan", "9 Oktober 2021"));

        listbookmark.add(new BookmarkClass("MNI", "Mesjid Nurul Ilmi", "21 Oktober 2021"));

        listbookmark.add(new BookmarkClass("Mamsky", "Kantin gedung F", "26 Oktober 2021"));

        listbookmark.add(new BookmarkClass("Audit", "Auditorium", "1 November 2021"));

        listbookmark.add(new BookmarkClass("FTI", "Fakultas Teknologi Informasi", "4 November 2021"));

        listbookmark.add(new BookmarkClass("kelas damin", "Gedung I 1.8", "7 November 2021"));

        listbookmark.add(new BookmarkClass("Kuliah PTB", "Gedung I 1.3", "11 November 2021"));

        return listbookmark;
    }
}