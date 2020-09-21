package com.example.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.firstactivity.Model.Book;
import com.google.gson.Gson;

import java.util.ArrayList;

public class Home extends AppCompatActivity {
    private Button homeBtn;
    private ArrayList<Book> bookList;
    private Gson gson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        homeBtn = findViewById(R.id.home_btn);
        bookList = new ArrayList<>();
        gson = new Gson();
        bookList.add(new Book("1", 190, "Book 1",  1, "Author 1"));
        bookList.add(new Book("2", 289.98, "Book 2",  1, "Author 2"));
        bookList.add(new Book("4", 289.98, "Book 2",  1, "Author 2"));
        bookList.add(new Book("2", 289.98, "Book 2",  1, "Author 2"));
        bookList.add(new Book("2", 289.98, "Book 2",  1, "Author 2"));
        bookList.add(new Book("2", 289.98, "Book 2",  1, "Author 2"));
        bookList.add(new Book("2", 289.98, "Book 2",  1, "Author 2"));
        bookList.add(new Book("2", 289.98, "Book 2",  1, "Author 2"));
        bookList.add(new Book("3", 321, "Book 3",  1, "Author 1"));

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String gsonBookList = gson.toJson(bookList);
                Intent intent = new Intent(Home.this, Payment.class);
                intent.putExtra("book_list_data", gsonBookList);
                startActivity(intent);
            }
        });
    }
}
