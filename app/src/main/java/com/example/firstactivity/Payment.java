package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.firstactivity.Adapter.PaymentListAdapter;
import com.example.firstactivity.Model.Book;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class Payment extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private ArrayList<Book> bookArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);

        Gson gson = new Gson();
        Type type = new TypeToken<ArrayList<Book>>(){}.getType();
        String bookList = getIntent().getStringExtra("book_list_data");
        bookArrayList = gson.fromJson(bookList, type);

        initRecyclerView();

    }

    private void initRecyclerView() {
        recyclerView = findViewById(R.id.payment_list);
        recyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new PaymentListAdapter(bookArrayList);

        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(mAdapter);

    }
}
