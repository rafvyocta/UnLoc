package com.example.tbptb.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tbptb.R;
import com.example.tbptb.model.BookmarkClass;

import java.util.ArrayList;

public class bookmarkAdapter extends RecyclerView.Adapter<bookmarkAdapter.bookmarkViewHolder>{

    //view holder
    public class bookmarkViewHolder extends RecyclerView.ViewHolder {
        TextView textnamabook, textnamalokasi, texttglsimpan;

        public bookmarkViewHolder(@NonNull View itemView) {
            super(itemView);
            textnamabook = itemView.findViewById(R.id.textBookmark);
            textnamalokasi = itemView.findViewById(R.id.textRute);
            texttglsimpan = itemView.findViewById(R.id.textSimpanBookmark);
        }
    }

    ArrayList<BookmarkClass> listbookmark = new ArrayList<>();

    //data yang akan ditampilkan
    public void setListbookmark(ArrayList<BookmarkClass> listbookmark) {
        this.listbookmark = listbookmark;
        notifyDataSetChanged();
    }

    //method adapter
    @NonNull
    @Override
    public bookmarkAdapter.bookmarkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.bookmark_rute, parent, false);
        bookmarkViewHolder viewHolder = new bookmarkViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull bookmarkAdapter.bookmarkViewHolder holder, int position) {
        BookmarkClass bookmarkClass = listbookmark.get(position);
        holder.textnamabook.setText(bookmarkClass.namabook);
        holder.textnamalokasi.setText(bookmarkClass.namalokasi);
        holder.texttglsimpan.setText(bookmarkClass.tglsimpan);

    }

    @Override
    public int getItemCount() {
        return listbookmark.size();
    }
}
